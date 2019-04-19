;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 7
;; By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the
;; 6th prime is 13.
;; What is the 10 001st prime number?
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn prime? [n]
  (and (zero? (mod n n))
       (zero? (mod n 1))
       (empty? (filter #(zero? (mod n %)) (range 2 n)))))

(defn nth-prime [n acc max]
  (if (= max (count acc))
    (last acc)
    (if (= true (prime? n))
      (recur (inc n) (conj acc n) max)
      (recur (inc n) acc max))))

;; (nth-prime 2 [] 10001)
