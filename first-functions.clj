(defn show-message []
    (println "------------------------")
    (println "Bem vindo(a) ao estoque!")
    (println "------------------------"))

(show-message)

(defn apply-discount 
    "Apply a discount according to the amount and percentage."
    [percentage gross-amount]
    (* gross-amount percentage))

(apply-discount 100)