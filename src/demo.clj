(ns demo)
;;;; Catnip demo
;; DEMO -1: Show file opening in Catnip with built-in search

;; DEMO 0: Error reporting
;;
;; Save this file (Ctrl-S) and Catnip will report *ERROR* in output
;; and with an icon next to wrap-me-with-parens
;; (still it will switch namespace)



;; DEMO 1: Wrap with ()
;;
;; To wrap st. with (), select it first and type (
;;(wrap-me-with-parens)



;; DEMO 2: REPL interaction with source
;;
;; TO DO: Type the function below
;; - show autom. indentation, autom. insertion of closing ) or "
;; Ctrl-S
;; - call the fun from repl
;; - then change the string, Ctrl-E (could -S), call again (up arrow)
;;(defn greeting []
;;  (println "Hello monsters!"))
(defn greeting []
  (println "Hello world!"))