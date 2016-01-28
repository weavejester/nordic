(defproject nordic "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [flupot "0.2.0"]]
  :plugins [[lein-cljsbuild "1.1.2"]]
  :cljsbuild
  {:builds [{:source-paths ["src"], :compiler {:output-to "target/main.js"}}]}
  :profiles
  {:provided {:dependencies [[org.clojure/clojurescript "1.7.228"]]}})
