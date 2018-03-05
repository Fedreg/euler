(ns euler.3
  (:require
   [euler.funcs :as f]))

"The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?"

(defn get-largest-factor [n]
  (->> (f/primes n)
       reverse
       (filter #(zero? (mod n %)))
       first))

(get-largest-factor 600851475143)


