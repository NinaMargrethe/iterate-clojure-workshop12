(ns iterate-clojure-workshop12.task07-seq-fun)

;; ### TASK E (OPTIONAL) ###
;; Use reduce to keep only the positive numbers from the following sequence
;; [1 -1 2 -2 -3 5] (expected result: [1 2 5])
;; Tip: You will need to use the second form of reduce, taking an initial value

(reduce
  (fn [accumulator num]
    (if (< num 0)
      accumulator
      (conj accumulator num)))
  []
  [1 -1 2 -2 -3 5])
