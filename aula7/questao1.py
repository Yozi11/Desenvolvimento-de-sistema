while True:
    try:
        numero1 = int(input("digite o primero numero: "))
        numero2 = int(input("digite o segundo numero: "))


        soma = numero1 + numero2
        print(f"soma dos numeros e {soma}")
        break
    except:
        print("dados invalido,somente!")    

