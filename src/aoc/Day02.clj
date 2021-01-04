(ns aoc.Day02)
; https://adventofcode.com/2020
(slurp "/home/acestus/IdeaProjects/aoc/src/aoc/02.txt")
; 1-3 a:abcde
; 1-3 b:cdefg
; 2-9 c:ccccccccc
; How many password are valid according to their policies?

(let [[_           min   max   ch    password]
      (re-matches #"(\d+)-(\d+) (\w:) (\w+)" "15-16 p: pppppppppplppppp")]
  min
  )