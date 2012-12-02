(ns iterate-clojure-workshop12.task05-if
  (:require [clojure.test :refer :all]))

;; Create the function abs that takes a number and returns its absolute value

(defn abs [n]
  (if (< n 0) 
    (- n) 
    n))

;; Test for the function
(deftest abs-test
  (is (= 4 (abs -4)))
  (is (= 4 (abs 4))))
