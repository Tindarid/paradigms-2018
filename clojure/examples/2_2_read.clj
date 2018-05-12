(chapter "Read and Homoiconicity")
(example "Read"
         (def expr (read-string "(+ x 10 (- x y))"))
         expr
         (type expr))
(example "Types"
         (mapv (comp println type) expr))
(example "Symbols"
         (type 'x)
         (type (symbol "x"))
         (= (symbol "x") 'x)
         (= "x" (str (symbol "x"))))
(example "Java functions"
         (java.lang.Math/abs -10)
         (Math/abs -10))
