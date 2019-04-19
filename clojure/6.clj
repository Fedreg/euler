;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 6
;; The sum of the squares of the first ten natural numbers is,
;;
;; 12 + 22 + ... + 102 = 385
;;
;; The square of the sum of the first ten natural numbers is,
;;
;; (1 + 2 + ... + 10)2 = 552 = 3025
;;
;; Hence the difference between the sum of the squares of the first ten natural numbers
;; and the square of the sum is 3025 − 385 = 2640.
;;
;; Find the difference between the sum of the squares of the first one hundred natural
;; numbers and the square of the sum.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn sum-squares [num max acc]
  (let [sq  (* num num)
        sum (+ acc sq)]
    (if (= num max)
      sum
      (recur (inc num) max sum))))

(defn square-sum [max]
  (let [r   (range (inc max))
        sum (reduce + r)]
    (* sum sum)))

(defn square-diff [max]
  (- (square-sum max)
     (sum-squares 1 max 0)))

(square-diff 100)
