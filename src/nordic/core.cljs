(ns nordic.core
  (:require [flupot.dom :as dom])
  (:require-macros [nordic.core :as core]))

(def ^:private tag-lookup
  (core/generate-tag-lookup))

(defn html [[tag & content]]
  (apply (tag-lookup tag) content))
