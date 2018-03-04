(ns euler.1)

"If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000."

(defn sum-mult-3-5 [max]
  (let [nums (range 1 max)
        func (fn [n] (cond
                       (= 0 (mod n 3)) n 
                       (= 0 (mod n 5)) n))]
    (->> nums
         (map func)
         (filter identity)
         (reduce +))))

;; (sum-mult-3-5 1000)

