(ns heliapi.core
  (:require [org.httpkit.client :as http]
            [cheshire.core :as json]))

(defn format-error
  "Return an error message for an error, url, and query."
  [error url query]
  (str "Could not fetch URL: '" url "', for query: '" query
       "'. Error: " error))

(defn make-url
  "Form full URL with query"
  [query]
  (str "http://www.helioid.com/searches/q/" query "?format=json"))

(defn web
  "Return results from Helioid categorize."
  [query]
  (let [url (make-url query)
        {:keys [_ _ body error] :as resp} @(http/get url)]
    (if error
      (throw
       (Exception. (format-error error url query)))
      (json/parse-string body true))))
