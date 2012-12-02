(ns iterate-clojure-workshop12.task03-datastruct-as-fun)

;; ### TASK A ###
;; Company finder: create the map city -> map of streets -> vector of companies 
;; on it. Given "New Oslo", "Bygdoey allee", <number in 0-2>, the map should
;; return the company on that address.

{"New Oslo" 
  {"Bygdoey allee" 
    ["Iterate" "Comoyo" "Peppes Pizza"]}}

;; ### TASK B ###
;; Use the map to find out what company is at address Bygdoey allee 1, New Oslo
;; (i.e. "New Oslo", "Bygdoey allee", 1)

((({"New Oslo" 
  {"Bygdoey allee" 
    ["Iterate" "Comoyo" "Peppes Pizza"]}}
    "New Oslo") "Bygdoey allee") 1)