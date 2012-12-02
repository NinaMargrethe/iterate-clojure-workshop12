(ns iterate-clojure-workshop12.task09-let
  (:require [clojure.test :refer :all]))

;; ### TASK A ###
;; Refactor the company-finder from task 4 to be more
;; readable by assigning the map and the individual  
;; subexpressions to local constants with let
;; (f.ex. constants atlas (the map), city-val, street-val, company)

(declare company-finder)
; TODO

;; Test for the function
(deftest company-finder-test
  (is (= "Iterate" (company-finder "Bygdoey allee" 0 "New Oslo")))
  (is (= "Comoyo" (company-finder "Bygdoey allee" 1 "New Oslo")))
  (is (= "Peppes Pizza" (company-finder "Bygdoey allee" 2 "New Oslo"))))
