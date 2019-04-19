;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 7
;; By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the
;; 6th prime is 13.
;; What is the 10001st prime number?
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn prime? [n]
  (and (zero? (mod n n))
       (zero? (mod n 1))
       (empty? (filter #(zero? (mod n %)) (range 2 n)))))

(defn prime-list [l max]
  (let [r   (range 1 (inc max) 2)
        cnt (count l)]
    (if (= 10001 cnt)
      (last l)
      (recur (if (prime? max)
               (conj l max)
               l)
             (inc max)))))

;;(prime-list [] 1)




