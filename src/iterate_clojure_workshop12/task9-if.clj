(ns iterate-clojure-workshop12.task9-if
  (:require [clojure.test :refer :all]))

;; Return the absolute value of a number using if.

; TODO

;; Test for the function
;; TIP: Un-comment the (comment ...) to disable the test temporarily:
;(comment
(deftest abs-test
  (is (= 4 (abs -4)))
  (is (= 4 (abs 4))))
;)