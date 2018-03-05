(ns euler.5
  (:require
   [euler.funcs :as f]))

"2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"

(defn smallest-number [max]
  (reduce #(f/lcm %1 %2) (range 1 (inc max))))

(smallest-number 20)
