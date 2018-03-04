(ns euler.7)

"By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?"

(defn prime? [n]
  (cond
    (not (not-any? #{2 3 5 7} [n])) true
    (= n (or 2 3 5 7)) true
    (= 0 (mod n 2)) false
    (= 0 (mod n 3)) false
    (= 0 (mod n 5)) false
    (= 0 (mod n 7)) false
    :else true))

(defn nth-prime [n acc max]
  (if (= max (count acc))
    (last acc)
    (if (= true (prime? n))
      (recur (inc n) (conj acc n) max)
      (recur (inc n) acc max))))

;; (nth-prime 2 [] 10001)
