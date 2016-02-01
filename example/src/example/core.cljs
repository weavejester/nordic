(ns example.core
  (:require [brutha.core :as br]
            [nordic.core :refer [html]]))

(br/mount
 (html [:p "Hello " [:strong "World"]])
 (.getElementById js/document "test"))
