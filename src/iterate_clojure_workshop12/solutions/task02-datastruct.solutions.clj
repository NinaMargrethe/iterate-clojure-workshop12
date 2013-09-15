(ns iterate-clojure-workshop12.task02-datastruct)

;; ### TASK A ###
;; Is list of the numbers 1 2 3 equal to a vector of the same numbers? 
;; Tip: Use the function = to compare them
(= '(1 2 3) [1 2 3])

;; ### TASK B ###
;; Is the list equal to a set of the same numbers?

(= #{1 2 3} '(1 2 3))