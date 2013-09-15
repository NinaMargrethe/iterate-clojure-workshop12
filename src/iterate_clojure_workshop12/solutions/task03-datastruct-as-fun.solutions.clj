(ns iterate-clojure-workshop12.task03-datastruct-as-fun)

;; ### TASK A ###
;; Company finder: create the map city -> map of streets -> vector of companies
;; on it. Given "New Oslo", "Frognerveien", <number in 0-2>, the map should
;; return the company on that address. I.e. the map contains something like:
;; "New Oslo"
;;      "Frognerveien"
;;            Iterate
;;            Comoyo
;;            Peppes pizza
;;
;; Background:
;; The government has decided to make Norway into the top technical country 
;; in the world. The first step is the creation of a new city, New Oslo, for all
;; the tech companies. Your task is to create a map to help the
;; international business locate tech companies in Norway, starting with
;; the city of New Oslo.
;; Following the agile methodologies, the government has first implemented a
;; minimal "slice" of the project. Thus New Oslo now has only one street,
;; Frognerveien, and there are only three companies: Iterate at number 0,
;; Comoyo at 1, and Peppes Pizza at 2 (food is crucial for techies).
;;
;; Note: We are going to build on this task later

(def map {"New Oslo"
 {"Frognerveien"
   ["Iterate", "Comoyo", "Peppes Pizza"]}})

;; ### TASK B ###
;; Use the map to find out what company is at address Frognerveien 1, New Oslo
;; (i.e. "New Oslo", "Frognerveien", 1)
;; Spoiler: you can use (def finder-map put-your-map-here) to assign
;; a name to your map that you can use later when looking for values in it:
;; (finder-map ...)

(((map "New Oslo") "Frognerveien") 1)
