(ns iterate-clojure-workshop12.task10-destructuring
  (:require [clojure.test :refer :all]))

;; ### TASK A ###
;; Change Uncle Scrooge's debtor registry form task14-java-interop.clj
;;  to use ["fname" "lname"] instead of "fname lname" and modify
;; check-debt to return "amount<tab>lname, fname"
;; ex: "1814 Duck, Donald"
;; Use destructuring in check-debtor's arguments to take the name vector apart.
;; Tips: use the function str similarly as you'd use println

; TODO

(add-debtor ["Donald" "Duck"] 1814)

;; Test
(deftest check-debtor-test
  (is (= "1814\tDuck, Donald" (check-debt ["Donald" "Duck"]))))

;; ### TASK B ###
;; Company finder 3: Change company-finder from task8-functions.clj
;; to use named arguments (i.e. a destructured map)"

; TODO (uncomment the test first)

;; Test
(comment
(deftest company-finder-test
  (is (= "ComoYo"
    (company-finder
      {:street "Frognerveien", :num 1, :city "New Oslo"}))))
)

