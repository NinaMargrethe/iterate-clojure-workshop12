Iterate Clojure Introduction Workshop 2012
==========================================

A practical, hands-on introduction into programming Clojure, the best JVM language ever :-)

Preparation before the workshop
-------------------------------

To get this repository:

    bash$ git clone git://github.com/iterate/iterate-clojure-workshop12.git; cd iterate-clojure-workshop12

To get all the tools you will need ready, execute the attached script (you might want to check/modify it if you already have Leiningen or Catnip installed):

    bash$ source prepare_all.sh

It will

* Download and initialize the latest Leiningen 2 (Clojure build tool)
* Leiningen will download Clojure 1.4.0
* It will download and start Catnip, the leightweight in-browse Clojure IDE;
    * Catnip should start a browser, if it doesn't, upon the URL printed.
    * In Catnip, type f.ex. `(println "hello")` and press Control-E to evaluate it to see that all is working
    * Press Control-C in the console to stop Catnip

### Development Environments

Recommended:

* Catnip (installed by the script)

Partially supported:

* Eclipse with Counterclockwise (quite popular)
* IntelliJ with LaClojure (somehow outdated)
* Emacs with [Clojure Mode](https://github.com/technomancy/clojure-mode) and [nREPL](https://github.com/kingtim/nrepl.el)

Unsupported (but you're free to try it anyway at your own risk):

* LightTable

Congratulations! You are now ready for the workshop.

The workshop
------------

The workshop consists of:

1. Brief introduction
2. Clojure-mini tutorial: a "minimal" subset of Clojure with fall-back to Java enabling you to read Clojure source codes and write interesting stuff; accompanied by hands-on tasks
3. The project of building a todo webapp using Noir

### The tasks

You should be able to finish each task in a short time, using the Clojure taught so far and Java.

### Project: The ultimate todo webapp

TBD

----

Produced by Ivar, Jakub, Lars @ Iterate 2012
