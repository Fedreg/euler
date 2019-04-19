(ns euler.3)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 3
;; "The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143 ?"
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn prime? [n]
  (and (zero? (mod n n))
       (zero? (mod n 1))
       (empty? (filter #(zero? (mod n %)) (range 2 n)))))

(defn prime-odd-range [max]
  (let [top (int (Math/sqrt max))
        bot (int (Math/sqrt top))]
  (lazy-seq (filter #(and (odd?   %)
                (prime? %))
          (range bot top)))))

(defn largest-prime [n nums]
  (let [xs (first nums)
        ys (rest nums)]
    (if (zero? (mod n (/ n xs)))
      xs
      (recur n ys))))

;; (time (largest-prime 600851475143 (reverse (prime-odd-range 600851475143))))
