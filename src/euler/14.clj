(ns euler.14
  (:require [euler.funcs :as f]))

;; The following iterative sequence is defined for the set of positive integers:

;; n → n/2 (n is even)
;; n → 3n + 1 (n is odd)

;; Using the rule above and starting with 13, we generate the following sequence:

;; 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
;; It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

;; Which starting number, under one million, produces the longest chain?

;; NOTE: Once the chain starts the terms are allowed to go above one million.

(defn collatz-sequence [n acc]
  (if (f/one? n)
    (conj acc 1)
    (cond
      (even? n) (collatz-sequence (/ n 2) (conj acc n))
      (odd?  n) (collatz-sequence (inc (* n 3)) (conj acc n)))))

(defn longest-collatz-sequence []
  (max (count (map #(collatz-sequence % []) (range 900000 1000000))))
