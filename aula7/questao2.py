



while True:
    try:
        idade = int(input("digite a idade :"))
        if idade >=18:
            print("voce e maior")
            break
        else:
            print("voce e menor")
            break
    except:
        print("dado invalido,somente numeros!")            