;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 6
;; The sum of the squares of the first ten natural numbers is,
;;
;; 12 + 22 + ... + 102 = 385
;;
;; The square of the sum of the first ten natural numbers is,
;;
;; (1 + 2 + ... + 10)2 = 552 = 3025
;;re
;; Hence the difference between the sum of the squares of the first ten natural numbers
;; and the square of the sum is 3025 − 385 = 2640.
;;
;; Find the difference between the sum of the squares of the first one hundred natural
;; numbers and the square of the sum.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn sum-nums [max]
  (let [l (reduce + (range (inc max)))]
    (* l l)))

(defn sum-squares [max]
  (let [r  (range (inc max))
        sq (map #(* %1 %2) r r)]
    (reduce + sq)))

(defn diffs [max]
  (- (sum-nums max) (sum-squares max)))

;;(diffs 100)


