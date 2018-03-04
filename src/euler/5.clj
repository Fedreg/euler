(ns euler.5)

"2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"

232792560

(defn rem? [n max]
  (let [res (map #(= 0 (mod n %)) (range 1 max))]
    (when-not (some false? res) true)))

(defn smallest-number [n max limit]
  (if (rem? n max)
    n
    (when (< n limit) (recur (+ n max) max limit))))

;; (smallest-number 0 20 1000000000)

