(defn show-message []
    (println "------------------------")
    (println "Bem vindo(a) ao estoque!")
    (println "------------------------"))

(show-message)

(defn apply-discount 
    "Apply a discount according to the amount and percentage, if gross amount is bigger than 100"
    [gross-amount]

    (if (> gross-amount 100)
        (let [percentage 0.10]
            (println "Apllying discount of " percentage)
            (* gross-amount percentage))
        gross-amount))

(apply-discount 100)