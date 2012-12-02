(ns iterate-clojure-workshop12.task08-java-interop
  (:require [clojure.test :refer :all]))

;; ### TASK A ###
;; Help Uncle Scrooge (Skrue) to keep a list of his debtors. 
;; Create a java.util.HashMap and two functions, add-debtor [name amount] 
;; and check-debt [name]. Add the initial debtor Donald Duck owing
;; $1814 to make the Uncle happy.
;; (Notice that the Uncle doesn't require any remove function in the 
;; first iteration as its business value has been deemed diminutive.)

(def debtors (new java.util.HashMap))

; TODO implement the map and check-debt
(defn check-debt [name]
  (.get debtors name))

(.put debtors "Donald Duck" 1814) ;; adding manually for add-debtor not defined yet

;; Test 1
(deftest check-debtor-test
  (is (= 1814 (check-debt "Donald Duck")))
  (is (nil? (check-debt "Uncle Srooge"))))

; TODO implement add-debtor
(defn add-debtor [name amount]
  (.put debtors name amount))

;; Test 2
(deftest add-debtor-test
  (do (add-debtor "Launchpad McQuack" 9999))
  (is (= 9999 (check-debt "Launchpad McQuack"))))