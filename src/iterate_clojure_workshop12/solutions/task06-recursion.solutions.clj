(ns iterate-clojure-workshop12.task06-recursion
  (:require [clojure.test :refer :all]))

;; Create an add function that sums a list. 

(defn add [list]
  (if (seq list)
    (+
      (first list)
      (add (rest list)))
    0))

(deftest add-test
  (is (= 6 (add '(1 2 3)))))
