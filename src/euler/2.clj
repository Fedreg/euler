(ns euler.2)

"Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms."

(defn fib [n]
  (case n
    0 n 
    1 n
    2 n
    (+ (fib (- n 1))
       (fib (- n 2)))))

(defn sum-even-fibs [max]
  (let [fib-seq (map fib (range 1 max))]
    (->> fib-seq 
         (filter even?)
         (reduce +))))

;; (sum-even-fibs 40000000)

