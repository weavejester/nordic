(ns nordic.core
  (:require [flupot.dom :as flupot]))

(defn- flupot-symbol [tag]
  (symbol "flupot.dom" (str tag)))

(defmacro generate-tag-lookup []
  (into {} (map (juxt keyword flupot-symbol) flupot/tags)))
