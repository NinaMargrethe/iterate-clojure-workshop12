(ns iterate-clojure-workshop12.task05-if
  (:require [clojure.test :refer :all]))

;; Return the absolute value of a number using if.

(defn abs [n]
  (if (< n 0) (- n) n))

;; Test for the function
;; TIP: Un-comment the (comment ...) to disable the test temporarily:
;(comment
(deftest abs-test
  (is (= 4 (abs -4)))
  (is (= 4 (abs 4))))
;)
