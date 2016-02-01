(ns nordic.core
  (:require [flupot.dom :as dom])
  (:require-macros [nordic.core :as core]))

(def ^:private tag-lookup
  (core/generate-tag-lookup))

(declare html)

(defn- render-vector [[tag & content]]
  (apply (tag-lookup tag) (map html content)))

(defn html [content]
  (if (vector? content)
    (render-vector content)
    content))
