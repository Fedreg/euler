(ns euler.5)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 5
;; 2520 is the smallest number that can be divided by each of the numbers from 1 to 10
;; without any remainder.
;;
;; What is the smallest positive number that is evenly divisible by all of the numbers
;; from 1 to 20?
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn gcd [a b]
  "Greatest common denominator"
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn lcm [a b]
  "Least common multiple"
  (/ (* a b) (gcd a b)))

(defn smallest-number [max]
  (reduce #(lcm %1 %2) (range 1 (inc max))))

;; (smallest-number 20)
