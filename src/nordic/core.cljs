(ns nordic.core
  (:require [flupot.dom :as dom])
  (:require-macros [nordic.core :as core]))

(def ^:private tag-lookup
  (core/generate-tag-lookup))

(declare render-vector)

(defn- flatten-args! [args content]
  (doseq [val content]
    (cond
      (vector? val) (.push args (render-vector val))
      (seq? val)    (flatten-args! args val)
      :else         (.push args val))))

(defn- render-vector [content]
  (let [func (tag-lookup (first content))
        args (doto (array) (flatten-args! (rest content)))]
    (.apply func nil args)))

(defn html [content]
  {:pre (vector? content)}
  (render-vector content))
