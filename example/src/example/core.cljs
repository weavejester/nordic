(ns example.core
  (:require [brutha.core :as br]
            [nordic.core :refer [html]]))

(br/mount
 (html
  [:div
   {:class "example"}
   [:p "Hello " [:strong "World"]]
   [:ul
    (for [x (range 5)]
      [:li x])]])
 (.getElementById js/document "test"))
