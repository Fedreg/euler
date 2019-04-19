;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 10
;; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
;;
;; Find the sum of all the primes below two million.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn prime? [n]
  (and (zero? (mod n n))
       (zero? (mod n 1))
       (empty? (filter #(zero? (mod n %)) (range 2 n)))))

(defn p [max]
  (let [nums (filter prime? (range 1 max 2))]
    (reduce + nums)))

;(p 2000000)
