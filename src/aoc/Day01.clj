(ns aoc.Day01
  (:require [clojure.string :as s]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
(foo 4)


(slurp "/home/acestus/IdeaProjects/aoc/src/aoc/01.txt")
; Find the two entries that sum to 2020
; and then multiply those two numbers together.
(defn read-numbers [filename]
  (->> filename
       slurp
       s/split-lines
       (map #(Integer/parseInt %))
       set))

(println
  (let [numbers (read-numbers "/home/acestus/IdeaProjects/aoc/src/aoc/01.txt")]
    (for [a numbers
          b numbers
          :let [c (- 2020 a b)]
          :when (< a b c)
          :when (contains? numbers c)]
      [a b c])))


