(ns euler.funcs)

(defn prime? [n]
  (cond
    (not (not-any? #{2 3 5 7} [n])) true
    (= n (or 2 3 5 7)) true
    (zero? (mod n 2)) false
    (zero? (mod n 3)) false
    (zero? (mod n 5)) false
    (zero? (mod n 7)) false
    :else true))

(defn primes [max]
  (->> max 
       (range 2)
       (filter #(= true (prime? %)))))

(defn palindrome? [n]
  (= (reverse (str n) ) (seq (str n))))

(defn gcd [a b]
  (if (zero? b)
    a
    (recur b (mod a b)))) 

(defn lcm [a b]
  (/ (* a b) (gcd a b))) 

(defn pythagorean-triplet? [a b c]
  (= (* c c) 
     (+ (* a a)
        (* b b))))
