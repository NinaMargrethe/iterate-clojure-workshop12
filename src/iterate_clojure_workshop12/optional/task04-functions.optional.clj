(ns iterate-clojure-workshop12.task04-functions
  (:require [clojure.test :refer :all]))

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
(deftest company-finder2-test
  (is (= "Iterate" (company-finder2 "Frognerveien" 0 "New Oslo")))
  (is (nil? (company-finder2 "Frognerveien" Integer/MAX_VALUE "New Oslo"))))
