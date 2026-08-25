numero = []

while True:
    num= int(input("digite o numero: "))
    if(num!=0):
        numero.append(num)
    else:
        break
    

soma = sum(numero)

print(f"A soma dos numero digitados e: {soma}")       