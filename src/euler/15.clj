(ns euler.15
  (:require [euler.funcs :as f]))

;; Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

;; How many such routes are there through a 20×20 grid?

(defn paths [grid-size]
  (+ grid-size (f/square grid-size grid-size 1 0)))

(paths (bigint 20))


