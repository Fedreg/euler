(ns euler.4)

"A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers."

(defn reverse-str [a]
  (->> a
      reverse
      (map str)
      (apply str)))

(defn palindrome? [a]
  (let [num (str a)
        len (count num)
        mid (if (odd? len) (/ (inc len) 2))
        p?  (if mid
              (= (subs num 0 (dec mid))
                 (reverse-str (subs num mid)))
              (= (subs num 0 (/ len 2))
                 (reverse-str (subs num (/ len 2)))))]
    p?))

(defn largest-palindrome [a b]
  (if (palindrome? (* a b))
    (* a b)
    (recur (dec a) b)))

;; (largest-palindrome 999 999)

