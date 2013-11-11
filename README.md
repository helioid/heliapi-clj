# heliapi-clj

A Clojure library designed to connect to the Helioid Categorization API.

## Installation

[heliapi "0.0.1"]

## Usage

```clojure
(:require [heliapi.core :as helioid])

(map #(:name %)
     (:categories (helioid/web "helioid")))
=> ("search refinement"
    "search engine"
    "results"
    "helioid choroiditis"
    "intranuclear helioid inclusions"
    "intranuclear helioid"
    "new"
    "helioid search")
```

## License

Copyright © 2013 Peter Lubell-Doughtie and Helioid Inc.

Distributed under the BSD 3-clause License.
