Iterate Clojure Introduction Workshop
=====================================

A practical, hands-on introduction into programming Clojure, the best JVM language ever :-)

[Clojure](http://clojure.org/) is a modern Lisp language ([Why Lisp?](http://www.paulgraham.com/avg.html)) 
targetting JVM and browsers, designed for concurrency, simplicity, and productivity. Clojure us especially 
popular for interactive web development and data analysis.

The workshops starts with a brief overview of why you might want to consider Clojure, then introduces the
elementary building blocks necessary to build something useful in a series of exercises, and concludes
with the construction of a simple web application (if time permits).

Preparation before the workshop
-------------------------------

To get this repository:

    bash$ git clone git://github.com/iterate/iterate-clojure-workshop12.git; cd iterate-clojure-workshop12

To get all the tools you will need ready, execute the attached script (you might want to check/modify it if you already have Leiningen or Catnip installed):

    bash$ source prepare_all.sh
    # Note: If downloading of dependencies gets stucked then stop it via Control-C and run './lein' manually

It will

* Download and initialize the latest Leiningen 2 (Clojure build tool)
* Leiningen will download Clojure 1.4.0
* It will download and start Catnip, the leightweight in-browser Clojure IDE;
    * Catnip should start a browser, if it doesn't, open the URL printed (Catnip is optimized for Chrome so use that)
    * In Catnip, type f.ex. `(println "hello")` and press Control-E to evaluate it to see that all is working
    * Press Control-C in the console to stop Catnip

### Ponder your reasons why Clojure might be interesting

One common complain was that we jumped into Clojure without really communication its value. While we would live to do that,
we believe our time together is more efficiently spent conding and you can well do it yourself. 
Respecting your time constraints, have a look at the following, priority-ordered motivtion treasures:

1. [Land of Lisp](http://landoflisp.com/) (Clojure primarily is a lisp) - scroll down a little; click on guild names for more info
2. [Clojure Philosophy](http://www.manning.com/fogus/) at the The Joy of Clojure page at Manning
3. Paul Graham's legendary essay [Beating the Averages](http://www.paulgraham.com/avg.html)
4. The great talk [Simple Made Easy](http://www.infoq.com/presentations/Simple-Made-Easy) by Rich Hickey

You may also want to check out the list of good [reasons why Clojure](http://www.quora.com/Clojure/Why-would-someone-learn-Clojure) by Leo Polovets at Quora.

### Development Environments

Recommended:

* Catnip (installed by the script; also supports the Markdown format used by this document)
    * Why Catnip? It is simple to install, sufficient, written in Clojure, and in Norway
    * Tip: Exceptionally you might need to force the repl to forget a function; execute `(ns-unmap *ns* 'name-of-the-test)` in the REPL

Partially supported:

* Eclipse with Counterclockwise (quite popular)
* IntelliJ with LaClojure (somehow outdated)
* Emacs with [Clojure Mode](https://github.com/technomancy/clojure-mode) and [nREPL](https://github.com/kingtim/nrepl.el)

Unsupported (but you're free to try it anyway at your own risk):

* LightTable

### Tip: Make Catnip available by default

We have added the Catnip Leiningen plugin as an explicit dependency of this project. You can also make it available to all project by adding it to your `~/.lein/profiles.clj`:

    {:user {:plugins [
        [lein-catnip "0.4.1"]
        ]
    }}

Trying to run `lein edit` without having Catnip in profiles or the project.clj will result in the failure "'edit' is not a task."

### Ready, steady, go!

Congratulations! You are now ready for the workshop.

The workshop
------------

The workshop consists of:

1. Brief introduction
2. Clojure-mini tutorial: a "minimal" subset of Clojure with fall-back to Java enabling you to read Clojure source codes and write interesting stuff; accompanied by hands-on tasks
3. The project of building a todo webapp using Noir

### Clojure reference documentation

* [Clojure-mini cheatsheet](https://docs.google.com/document/pub?id=1ELQ0S03SLwYm1G-iXMQXnLDoKTggD93FqIMD9_ME5og)
* [Official Clojure heatsheet](http://clojure.org/cheatsheet)
* [Doc & examples for functions at clojuredocs.org](http://clojuredocs.org/)
* REPL: `(doc <function-name>)`, `(find-doc <regular expression string/pattern>)`, examples: `(cdoc <function name>)`

### The tasks

You should be able to finish each task in a short time, using the Clojure taught so far and Java. You can use Catnip for them - simply run `lein edit` in this directory.

Don't read the \*.solutions.clj files and further tasks ahead of time since revealing the solution would spoil the fun.

Tip: Don't waste time, whenever lost, unsure how to progress, or experiencing problems, ask the instructors for assistence.

### Project: The ultimate todo webapp

You will create a simple TODO web application using the popular Clojure web framework Noir.

Tip: Do not hesitate to ask the instructors for assistence. You are expected to encounter problems
that you cannot solve. Try to handle it yourself first but if it takes over 1/2 min, ask for help.

#### 1. Create the project

With Leiningen 2 it is easy:

    export PATH="$PATH:$(pwd)"  	# add lein to the path; run it in this directory
    lein new noir ultimate-todo
    cp project.clj.ultimate-todo ultimate-todo/project.clj
    cd ultimate-todo
    lein run &  			# run the webapp
    lein edit   			# start Catnip

(We'll use an improved project.clj that makes sure that Catnip is available and fixes a dependency conflict to make it works.)

Notice that Noir will pick up and reload changes to its source files automatically (a side-effect is the loss of any session state in the webapp).

#### 2. Getting to know Noir: The built-in tutorial

We will first get to know Noir by following the instructions it shows when started at [localhost:8080](http://localhost:8080/) to build a simple page.

#### 3. Building the ultimate todo webapp

We will follow the Getting started instructions at [webnoir.org](http://webnoir.org/) 
(aside of the project creation). Notice that the instructions aren't complete, they don't show 
you how to write the "back-end" functions and data structures (such as `all-todos`, `add-todo`, 
`remove-todo`) - you will need to find that out yourself.

Suggestions for progress:

1. Start by building a completely static site (hard-coded, fixed todo list)
2. Use a global variable and Java HashMap to hold the state
3. (Advanced) Use Clojure map instead of Java HashMap
4. (Advanced) Use Clojure [atom](http://clojure.org/atoms) instead of the global variable ([more here](http://blakesmith.me/2012/05/25/understanding-clojure-concurrency-part-2.html))

Tips & catches:

* Use e.g. `curl` to test adding and removing todos
* Numbers in Clojure are java.lang.Long and not integers; the values of post/get parameters in Noir are strings
* You can test `(defpartial fname ...)` simply a calling it as a function: `(fname ...)`
* You might want to run `lein -o repl` aside of Catnip to have access to its built-in
 documentation lookup (doc, user/clojuredocs, find-doc, source) if Catnip's Ctrl-H isn't enough

#### 4. Extending the todo webapp

If you have time an energy, you can go on extending the todo webapp:

* [Add a form](http://webnoir.org/tutorials/forms) for creating new todos
* Extend todos with priority and sort them by priority (f.ex. high, normal, low)

Check [Noir's documentation and examples](http://webnoir.org/tutorials).

Next steps
----------

* Watch Chas Emerick's [excellent screencast Starting Clojure](http://cemerick.com/2012/05/02/starting-clojure/). It is a great example of Clojure development in general and, in particular, interactive Clojure web development without restarts, with live code changes and direct access to the running app via REPL. It also makes a good job of introducing the Eclipse Clojure plugin Counterclockwise and the popular web framework Compojure with the template engine Enlive and HTTP abstraction Ring. Highly recommended!
* Start solving the [programming tasks at 4clojure.com](http://www.4clojure.com/problems), from elementary to hard, while following some of the [top 100 users](http://www.4clojure.com/users) so that you can compare your solution to theirs and thus learn from them
* Read the excellent [Joy of Clojure](http://joyofclojure.com/) that introduces not only the language but also, more importantly, the philosophy behind it and the correct way of doing things
* Explore [clojure-doc.org](http://clojure-doc.org/)


----

Produced by Ivar, Jakub, Lars @ Iterate 2012
