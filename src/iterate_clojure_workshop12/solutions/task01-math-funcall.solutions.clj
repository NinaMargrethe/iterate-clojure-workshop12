(ns iterate-clojure-workshop12.task01-funcall)

;; TASK:
;; Determine if 3*3*3*3 -2 is less than 13*13*5 / 10? 
;; (do not use any functions, output should be true or false)

(< 
  (- (* 3 3 3 3) 2)
  (/ (* 13 13 5) 10))

;; ### TASK B ###
;; Same as A but use java.lang.Math/pow to simplify the expression with
;; 3^4 and 13^2

(< 
  (- (Math/pow 3 4) 2)
  (/ (* (Math/pow 13 2) 5) 10))

;; ### TASK C ###
;; Modify the solution to B to return the larger of the two numbers
;; instead of true/false

(Math/max 
  (- (Math/pow 3 4) 2)
  (/ (* (Math/pow 13 2) 5) 10))