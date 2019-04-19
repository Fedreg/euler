;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 9
;; A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
;;
;; a2 + b2 = c2
;; For example, 3(2) + 4(2) = 9 + 16 = 25 = 5(2).
;;
;; There exists exactly one Pythagorean triplet for which a + b + c = 1000.
;; Find the product abc.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn pythagorean-triplet? [a b c]
  (= (* c c)
     (+ (* a a)
        (* b b))))

(first (for [a (range 1 1000)
             b (range 1 1000)
             :let [c (- 1000 a b)]
             :when (pythagorean-triplet? a b c)] (* a b c)))
