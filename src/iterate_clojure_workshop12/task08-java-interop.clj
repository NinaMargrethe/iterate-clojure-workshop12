(ns iterate-clojure-workshop12.task08-java-interop
  (:require [clojure.test :refer :all]))

;; ### TASK A ###
;; Help Uncle Scrooge (Skrue) to keep a list of his debtors. 
;; Create a java.util.HashMap and two functions, add-debtor [name amount] 
;; and check-debt [name]. Add the initial debtor Donald Duck owing
;; $1814 to make the Uncle happy.
;; (Notice that the Uncle doesn't require any remove function in the 
;; first iteration as its business value has been deemed diminutive.)

(declare check-debt)
; TODO implement the map and check-debt

;; Test 1
(deftest check-debtor-test
  (is (= 1814 (check-debt "Donald Duck")))
  (is (nil? (check-debt "Uncle Srooge"))))

(declare add-debtor)
; TODO implement add-debtor

;; Test 2
;; TIP: Comment the (comment ...) with ; or delete the line before and after
;; the test to enable the test:
(comment
(deftest add-debtor-test
  (do (add-debtor "Launchpad McQuack" 9999))
  (is (= 9999 (check-debt "Launchpad McQuack"))))
)
