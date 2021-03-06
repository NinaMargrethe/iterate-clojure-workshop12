(ns iterate-clojure-workshop12.task06-recursion
  (:require [clojure.test :refer :all]))

;; Create an add function that sums a list using recursion and + of two operands
;; Tip: Solve as "the first element + sum of the remaining elements"
;; Tip: Use (if (seq nums) ...) to check that nums is not empty

(defn add [nums]
  (if (seq nums)
    (+
      (first nums)
      (add (rest nums)))
    0))

(deftest add-test
  (is (= 6 (add '(1 2 3)))))
