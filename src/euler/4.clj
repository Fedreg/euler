(ns euler.4
  (:require
   [euler.funcs :as f]))

"A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers."

(defn largest-palindrome [a b]
  (if (f/palindrome? (* a b))
    (* a b)
    (recur (dec a) b)))

(largest-palindrome 999 999)

