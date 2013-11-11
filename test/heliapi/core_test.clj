(ns heliapi.core-test
  (:require [heliapi.core :refer :all])
  (:use     [midje sweet]))

(def query "helioid")

(fact "returns results for query"
      (:query (web query)) => query)

(fact "returns categories for query results"
      (:categories (web query)) => truthy)
