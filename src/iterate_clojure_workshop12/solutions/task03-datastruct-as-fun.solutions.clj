(ns iterate-clojure-workshop12.task03-datastruct-as-fun)

;; ### TASK A ###
;; Company finder: create the map city -> map of streets -> vector of companies 
;; on it. Given "New Oslo", "Frognerveien", <number in 0-2>, the map should
;; return the company on that address.

{"New Oslo"
  {"Frognerveien"
    ["Iterate" "Comoyo" "Peppes Pizza"]}}

;; ### TASK B ###
;; Use the map to find out what company is at address Frognerveien 1, New Oslo
;; (i.e. "New Oslo", "Frognerveien", 1)

((({"New Oslo"
  {"Frognerveien"
    ["Iterate" "Comoyo" "Peppes Pizza"]}}
    "New Oslo") "Frognerveien") 1)