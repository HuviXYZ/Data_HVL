{-
t = [0..99]
t1 = [x | x <- t, x > 10 && x < 20 ]


t2 = [(y+3)/2 | y <- t1]

main = do
    print t2
-}

{-q7

d = [x | x <- [-100..100], -1 < x && x <3]

main = do
    print d
-}



{-q7
s = [2,4,6]
t = [1,3,5]

k = [(x,y) | x <- s, y <- t]
b = [(x,y) | x <- t, y <- t]

main = do
    print b

-}

{- Q9

-}

 {-q10
h x = (x-2)^2

k x = (x-1)*(x-3)+1

ved faktorisering er h = k
får også ut true bolean verdi av å sammeline fek h 5 == k 5

 -}

 {-q11

 
 -}

f :: Integer -> Integer
f x = 3*x














