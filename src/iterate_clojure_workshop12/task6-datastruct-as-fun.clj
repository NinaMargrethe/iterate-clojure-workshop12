(ns iterate-clojure-workshop12.task6-datastruct-as-fun)

;; ### TASK A ###
;; Company finder: create a map city -> map of streets -> vector of companies on it
;; Background:
;; The government has decided to make Norway into the top technical country 
;; in the world. The first step is the creation of a new city, New Oslo, for all
;; the tech companies. Your task is to create a map to help the
;; international business locate tech companies in Norway, starting with
;; the city of New Oslo.
;; Following the agile methodologies, the government has first implemented a
;; minimal "slice" of the project. Thus New Oslo now has only one street,
;; Bygdøy allé, and there are only three companies: Iterate at number 0,
;; ComoYo at 1, and Peppes Pizza at 2 (food is crucial for techies).
;; Create a map that, given "New Oslo", "Bygdøy allé", <number in 0-2> will
;; return the company on that address.
;;
;; Note: We are going to build on this task later

; TODO

;; ### TASK B ###
;; Use the map to find out what company is at address Bygdøy allé 1, New Oslo
;; (i.e. "New Oslo", "Bygdøy allé", 1)
;; Spoiler: you can use (def finder-map put-your-map-here) to assign
;; a name to your map that you can use later when looking for values in it:
;; (finder-map ...)

; TODO