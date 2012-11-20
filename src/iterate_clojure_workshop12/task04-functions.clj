(ns iterate-clojure-workshop12.task04-functions
  (:require [clojure.test :refer :all]))

;; TIP:
;; Whenever you save this file in Catnip (Ctrl-S), it will be automatically 
;; re-loaded by the REPL below so you can use it to experiment with your new 
;; code.
;; Ex.: write a simple function, Ctrl-S, Ctrl-R to jump to repl, call the function to 
;; verify it returnes what expected. The REPL is stateful and remembers defs etc.

;; ### TASK A ###
;; Company finder 2: Create the function company-finder that 
;; takes [street num city] and returns the company there,
;; using the map created in task 3
;; The map should not be visible outside of the function.

; TODO

;; Test for the function
;; TIP: Un-comment the (comment ...) to disable the test temporarily:
;(comment
(deftest company-finder-test
  (is (= "Iterate" (company-finder "Bygdøy allé" 0 "New Oslo")))
  (is (= "ComoYo" (company-finder "Bygdøy allé" 1 "New Oslo")))
  (is (= "Peppes Pizza" (company-finder "Bygdøy allé" 2 "New Oslo"))))
;)

;; ### TASK B ###
;; Create function iff [cond is-true is-false] that returns the is-true
;; parameter if the cond parameter is true, and otherwise returnes the
;; is-false parameter.
;; Use a map to implement it.

; TODO (uncomment the test below first)

;; Test for the function
(comment
(deftest iff-test
  (is (= "It's true!" (iff (> 1 0) "It's true!" "Your math is wrong")))
  (is (= :falsy (iff false :truthy :falsy))))
)
