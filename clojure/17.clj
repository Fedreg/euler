;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 17
;; If the numbers 1 to 5 are written out in words: one, two, three, four, five, then
;; there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
;;
;; If all the numbers from 1 to 1000 (one thousand) inclusive were written out
;; in words, how many letters would be used?
;;
;;
;; NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two)
;; contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
;; The use of "and" when writing out numbers is in compliance with British usage.
;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; NOTE, this is terrible code that works

(declare *t)

(defn get-digit [n d]
  (let [place (if (f/one? d) first last)]
  (-> n
      str
      place
      str
      (Integer/parseInt))))

(defn drop-digit [n]
  (->> n
       str
       rest
       (apply str)
       Integer/parseInt
       ))

(defn -num-words [n]
  (case n
    1 "one"
    2 "two"
    3 "three"
    4 "four"
    5 "five"
    6 "six"
    7 "seven"
    8 "eight"
    9 "nine"
    10 "ten"
    11 "eleven"
    12 "twelve"
    13 (*1 3)
    14 (*1 4)
    15 "fifteen"
    16 (*1 6)
    17 (*1 7)
    18 (*1 8)
    19 (*1 9)
    20 "twenty"
    30 "thirty"
    40 "forty"
    50 "fifty"
    60 "sixty"
    70 "seventy"
    80 "eighty"
    90 "ninety"
    100 "hundred"
    1000 "onethousand"
    :none))

(defn num-words [n]
  (cond
    (not= :none (-num-words n)) (-num-words n)
    (and (< n 30)
         (> n 20)) (*n n 20)
    (and (< n 40)
         (> n 30)) (*n n 30)
    (and (< n 50)
         (> n 40)) (*n n 40)
    (and (< n 60)
         (> n 50)) (*n n 50)
    (and (< n 70)
         (> n 60)) (*n n 60)
    (and (< n 80)
         (> n 70)) (*n n 70)
    (and (< n 90)
         (> n 80)) (*n n 80)
    (and (< n 100)
         (> n 90)) (*n n 90)
    (and (< n 1000)
         (> n 100)) (*h n)
    ))

(defn *t [n]
  "Constructs teen numbers"
  (str (-num-words n) "teen"))

(defn *n [n factor]
  "constructs general numbers"
  (str (-num-words factor) (-num-words (get-digit n 0))))

(defn *h [n]
  "constructs hundred numbers"
  (str (-num-words (get-digit n 1))
       (-num-words 100)
       (num-words (drop-digit n))
       ))

(defn letter-counter [n]
  (->> n
       inc
       (range 1)
       (map num-words)
       (mapcat str)
       count))

;;(letter-counter 1000)
