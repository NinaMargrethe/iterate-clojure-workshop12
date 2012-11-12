(ns iterate-clojure-workshop12.task16-destructuring
  (:require [clojure.test :refer :all]))

;; ### TASK A ###
;; Change Uncle Scrooge's debtor registry form task14-java-interop.clj
;;  to use ["fname" "lname"] instead of "fname lname" and modify
;; check-debt to return "amount<tab>lname, fname"
;; ex: "1814 Duck, Donald"
;; Use destructuring in check-debtor's arguments to take the name vector apart.
;; Tips: use the function str similarly as you'd use println

; TODO
(def debtors (new java.util.HashMap))

(defn add-debtor [name amount]
  (.put debtors name amount))

(defn check-debt [[fname lname]]
    (str 
      (.get debtors [fname lname]) 
      "\t" 
      lname 
      ", " 
      fname))

(add-debtor ["Donald" "Duck"] 1814)

;; Test
(deftest check-debtor-test
  (is (= "1814\tDuck, Donald" (check-debt ["Donald" "Duck"]))))

;; ### TASK B ###
;; Company finder 3: Change company-finder from task8-functions.clj
;; to use named arguments (i.e. a destructured map)"

; TODO
(defn company-finder [{ :keys [street num city]}]
  ((({"New Oslo" {"Bygdøy allé" ["Iterate" "ComoYo" "Peppes Pizza"]}}
    city) street) num))

;; Test
(deftest company-finder-test
  (is (= "ComoYo" 
    (company-finder 
      {:street "Bygdøy allé", :num 1, :city "New Oslo"}))))


