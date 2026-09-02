while True:
    try:
        numero = int(input("digite um numero: "))
        
        for i in range(1,11):
            resultado = numero * i
            print(f"{numero} x {i} = {resultado}")
        break
    except:
        print("erro digite de novo")    