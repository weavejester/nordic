(ns nordic.core
  (:require [flupot.dom :as dom]))

(defn html [_]
  (dom/p "Hello World"))
