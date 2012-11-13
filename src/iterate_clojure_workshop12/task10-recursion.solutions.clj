(ns iterate-clojure-workshop12.task10-recursion
  (:require [clojure.test :refer :all]))

;; Create an add function that sums a list. 
;; It should take an initial value (0) and a list.

(defn add [initial list]
  (if (seq list)
    (add (+ initial (first list)) (rest list))
    initial))

(deftest add-test
  (is (= 6 (add 0 '(1 2 3)))))

(run-tests)
  