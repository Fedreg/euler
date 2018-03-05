(ns euler.7
  (:require
   [euler.funcs :as f]))

"By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?"

(defn nth-prime [n acc max]
  (if (= max (count acc))
    (last acc)
    (if (= true (f/prime? n))
      (recur (inc n) (conj acc n) max)
      (recur (inc n) acc max))))

(nth-prime 2 [] 10001)
