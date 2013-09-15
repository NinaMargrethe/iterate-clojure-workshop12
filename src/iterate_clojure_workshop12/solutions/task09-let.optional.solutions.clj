(ns iterate-clojure-workshop12.task09-let
  (:require [clojure.test :refer :all]))

;; ### TASK B (optional) ###
;; if you have implemented iff-fn in the optional task4
;; and used it to return null when an
;; out of bound street num is passed it, improve it now to actually
;; check against the actual length of the street instead of hard-coding 3.
;; Tip: The function count returns the size of a sequence.

(defn iff-fn [cond if-fn else-fn]
  (
    ({true if-fn, false else-fn} cond)
))

(defn company-finder2 [street num city]
  (let [
    atlas {"New Oslo" {"Bygdoey alle" ["Iterate" "Comoyo" "Peppes Pizza"]}}
    city-val (atlas city)
    street-val (city-val street)]

  (iff-fn (< num (count street-val))
    (fn [] (street-val num))
    (fn [] (println "Sorry, that street isn't that long")))))

;; Test for the function
;(comment
(deftest company-finder2-test
  (is (= "Iterate" (company-finder2 "Bygdoey alle" 0 "New Oslo")))
  (is (nil? (company-finder2 "Bygdoey alle" Integer/MAX_VALUE "New Oslo"))))
;)