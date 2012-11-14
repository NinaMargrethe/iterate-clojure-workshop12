#!/bin/sh
echo ">>> Downloading Leiningen 2 ..."
wget --no-check-certificate https://raw.github.com/technomancy/leiningen/preview/bin/lein
chmod u+x lein

echo
echo ">>> Executing Leiningen to initialize it and Clojure ..."
./lein

echo
echo ">>> DONE, you can now try to run './lein repl' to get Clojure REPL"

echo
echo ">>> Running Catnip, it should open in a browser..."
./lein edit
