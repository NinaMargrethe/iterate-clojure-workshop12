(ns iterate-clojure-workshop12.task04-functions
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

; (declare company-finder) ;; no needed anymore though we could leave it here
; TODO
(defn company-finder [street num city]
  ((({"New Oslo" {"Bygdoey allee" ["Iterate" "Comoyo" "Peppes Pizza"]}}
    city) street) num))

;; Test for the function
;; TIP: Un-comment the (comment ...) to disable the test temporarily:
;(comment
(deftest company-finder-test
  (is (= "Iterate" (company-finder "Bygdoey allee" 0 "New Oslo")))
  (is (= "Comoyo" (company-finder "Bygdoey allee" 1 "New Oslo")))
  (is (= "Peppes Pizza" (company-finder "Bygdoey allee" 2 "New Oslo"))))
;)

;; ### TASK B ###
;; Create function iff [cond, if-val, else-val] that returns 
;; the if-val if cond is true otherwise else-val.
;; Use a map to implement it.

; TODO
(defn iff [cond if-val else-val]
  ({true if-val, false else-val} cond))

;; Test for the function
(deftest iff-test
  (is (= "It's true!" (iff (> 1 0) "It's true!" "Your math is wrong")))
  (is (= :falsy (iff false :truthy :falsy))))
