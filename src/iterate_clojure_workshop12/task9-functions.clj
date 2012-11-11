(ns iterate-clojure-workshop12.task9-functions
  (:require [clojure.test :refer :all]))

;; TIP:
;; Whenever you save this file in Catnip (Ctrl-S), it will be automatically 
;; re-loaded by the REPL below so you can use it to experiment with your new 
;; code (ex.: write a simple function, ctrl-S, Ctrl-R, call the function to 
;; verify it returnes what expected)

;; ### TASK A ###
;; Company finder 2: Create the function company-finder that 
;; takes [street num city] and returns the company there.
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
;; Create function iff [cond, if-val, else-val] that returns 
;; the if-val if cond is true otherwise else-val.
;; Use a map to implement it.

; TODO

;; Test for the function
;(comment
(deftest iff-test
  (is (= "It's true!" (iff (> 1 0) "It's true!" "Your math is wrong")))
  (is (= :falsy (iff false :truthy :falsy))))
;)

;; ### TASK C (optional) ###
;; Write the function iff-fn similar to B but if-val and else-val are functions 
;; that are executed and 
;; their result is returned; only the function that is actually needed
;; should be executed.
;; Use the new function in the company finder to print 
;; "Sorry, that street isn't that long" and return nil if the street number 
;; is higher than the street's length
;; You can hard-code the street length as 3
;; Tip: println returns nil

; TODO

;; Test for the function
;(comment
(deftest company-finder2-test
  (is (= "Iterate" (company-finder2 "Bygdøy allé" 0 "New Oslo")))
  (is (nil? (company-finder2 "Bygdøy allé" Integer/MAX_VALUE "New Oslo"))))
;)