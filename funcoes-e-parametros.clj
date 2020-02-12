(defn imprime-mensagem []
    (println "------------------------")
    (println "Bem vindo(a) ao estoque!")
    (println "------------------------"))

(imprime-mensagem)

(defn valor-descontado 
    "Retorna o valor descontado:  90% do valor bruto."
    [valor-bruto]
    (* valor-bruto 0.9))

(valor-descontado 100)