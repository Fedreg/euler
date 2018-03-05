(ns euler.funcs)

(defn prime? [n]
  (if
    (some true? (map (fn [a] (zero? (mod n a))) (range 2 n)))
    false
    true))

(defn primes [max]
  "Returns all primes up to max"
  (->> max 
       (range 2)
       (filter #(= true (prime? %)))))

(defn palindrome? [n]
  (= (reverse (str n) ) (seq (str n))))

(defn gcd [a b]
  "Greatest common denominator"
  (if (zero? b)
    a
    (recur b (mod a b)))) 

(defn lcm [a b]
  "Least common multiple"
  (/ (* a b) (gcd a b))) 

(defn pythagorean-triplet? [a b c]
  (= (* c c) 
     (+ (* a a)
        (* b b))))
