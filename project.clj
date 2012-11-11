(defproject iterate-clojure-workshop12 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [noir "1.3.0-beta3"] ; to make sure Noir is available locally
		 [cheshire "3.1.0"]   ; upgraded ch. to fix Catnip
  ]
  :plugins [[lein-catnip "0.4.1"]])
