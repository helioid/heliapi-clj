(defproject heliapi-clj "0.1.0-SNAPSHOT"
  :description "Helioid clojure API"
  :url "http://helioid.com"
  :license {:name "BSD 3-clause License"
            :url "http://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [http-kit "2.1.12"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]}}
  :plugins [[lein-midje "3.0.1"]])
