(ns iterate-clojure-workshop12.task07-seq-fun)

;; ### TASK A - map ###
;; Use the + function to sum two lists '(1 2 3) and '(2 2 2) 
;; (the expected result being '(3 4 5))
;; Tip: The map function can take multiple collection
;; Run (doc map) in 'lein repl' or Ctrl-H in Catnip to learn more about map

(map + '(1 2 3) '(2 2 2))

;; ### TASK B - reduce ###
;; Solve 1 + 2 + 3 using reduce and not (+ 1 2 3).

(reduce + '(1 2 3))

;; ### TASK C - apply ###
;; Find the largest number in the list '(2 6 4)
;; (You can find out the maximum of numbers using (max 2 6 4)
;; but here you got a list containing the numbers.)

(apply max '(2 6 4))

;; ### TASK D - map + apply ###
;; Use the functions map and apply to find out how old is the oldest person in  
;; this list of maps: 
;; '({ :name "Lars", :age 25 }, { :name "Jakub", :age 32 })

(apply max
  (map :age
    '({ :name "Lars", :age 25 }, 
      { :name "Jakub", :age 32 })))
