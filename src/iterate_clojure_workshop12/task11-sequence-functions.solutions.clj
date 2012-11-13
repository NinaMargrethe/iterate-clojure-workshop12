(ns iterate-clojure-workshop12.task11-map)

;; map
;; Use the * function to sum to lists '(1 2 3) and '(2 2 2) to '(2 4 6)

(map * '(1 2 3) '(2 2 2))


;; reduce
;; Solve 1 + 2 + 3 using reduce and not (+ 1 2 3).

(reduce + '(1 2 3))


;; apply
;; Find the max value from the list '(2 6 4)

(apply max '(2 6 4))


;; Use map and apply to find how old the oldest person in the list is in this map:
;; '({ :name "Lars", :age 25 }, { :name "Jakub", :age 32 })

(apply max
  (map :age
    '({ :name "Lars", :age 25 }, 
      { :name "Jakub", :age 32 })))

;; Modify the previous solution to find the complete map of the oldest person using reduce.
;; TIP: use the second form of reduce with an initial value.
