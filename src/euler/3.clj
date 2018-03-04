(ns euler.3)

"The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?"

(defn prime? [n]
  (cond
    (not (not-any? #{2 3 5 7} [n])) true
    (= n (or 2 3 5 7)) true
    (= 0 (mod n 2)) false
    (= 0 (mod n 3)) false
    (= 0 (mod n 5)) false
    (= 0 (mod n 7)) false
    :else true))

(defn primes [max]
  (->> max 
       (range 2)
       (filter #(= true (prime? %)))))

(defn get-largest-factor [n]
  (->> (primes n)
       reverse
       (filter #(= 0 (mod n %)))
       first))

;; (get-largest-factor 600851475143)


