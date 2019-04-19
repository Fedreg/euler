;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 20
;; n! means n × (n − 1) × ... × 3 × 2 × 1
;;
;; For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
;; and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
;;
;; Find the sum of the digits in the number 100!
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn factorial [n acc]
  (if (= 1 n)
    acc
    (recur (dec n) (* n acc))))

(defn sum-digits [n]
  (->> (factorial (bigint n) 1)
       str
       seq
       (map #(Integer/parseInt (str %)))
       (reduce +)))

;(sum-digits 100)

