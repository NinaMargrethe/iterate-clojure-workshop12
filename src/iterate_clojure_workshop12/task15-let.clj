(ns iterate-clojure-workshop12.task15-let
  (:require [clojure.test :refer :all]))

;; ### TASK A ###
;; Refactor the company-finder from task8-functions.clj to be more
;; readable by assigning the map and the individual the individual  
;; subexpressions (streets, companies) to local constants with let

; TODO

;; Test for the function
(deftest company-finder-test
  (is (= "Iterate" (company-finder "Bygdøy allé" 0 "New Oslo")))
  (is (= "ComoYo" (company-finder "Bygdøy allé" 1 "New Oslo")))
  (is (= "Peppes Pizza" (company-finder "Bygdøy allé" 2 "New Oslo"))))

;; ### TASK B (optional) ###
;; if you have implemented iff-fn and used it to return null when an
;; out of bound street num is passed it, improve it now to actually
;; check against the actual length of the street instead of hard-coding 3.
;; Tip: The function count returns the size of a sequence.

; TODO