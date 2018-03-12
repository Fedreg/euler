(ns euler.16)

;; 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

;; What is the sum of the digits of the number 2^1000?

(defn square [n pow acc cnt]
  (if (= cnt pow)
    acc 
    (recur n pow (* n acc) (inc cnt))))

(square (bigint 2) 1000 1 0)

(defn sum-digits [n pow]
  (as-> (bigint n) a 
      (square a pow 1 0)
      (str a)
      (seq a)
      (map #(Integer/parseInt (str %)) a)
      (reduce + a)))

(sum-digits 2 1000)

