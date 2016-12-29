(ns modern-cljs.core)

(enable-console-print!)

(println "Hello World 3 !")

(def counter (atom 0))

(js/setInterval (fn []
                  (swap! counter inc)
                  (set! (.-innerHTML (js/document.querySelector "h1")) @counter))
                1000)
