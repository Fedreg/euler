(ns euler.4)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 4
;; A palindromic number reads the same both ways. The largest palindrome made from the product
;; of two 2-digit numbers is 9009 = 91 × 99.
;;
;; Find the largest palindrome made from the product of two 3-digit numbers."
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn palindrome? [n]
  (= (reverse (str n) ) (seq (str n))))

(defn largest-palindrome [a b]
  (if (palindrome? (* a b))
    (* a b)
    (recur (dec a) b)))

;; (largest-palindrome 999 999)

