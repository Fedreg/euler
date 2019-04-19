;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; # 3
;; "The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143 ?"
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defun range (min max)
   (loop for n from min below max
      collect n))

(defun primep (n)
  (equalp 0 (length (and (zerop (mod n n))
                    (zerop (mod n 1))
                    (remove-if-not #'(lambda (num) (zerop (mod n num))) (range 2 n))))))



