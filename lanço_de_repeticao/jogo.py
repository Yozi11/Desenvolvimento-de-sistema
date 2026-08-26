import random,os,time


numero_secreto = random.randint(1,100)
tentativas = 0


while True:
    numero = int(input("digite o numero secreto: "))
    tentativas +=1
    
    if (numero==numero_secreto):
        print(f"parabens voce acertou o numero em {tentativas}")
    elif(numero_secreto>numero):
        print(f"o numero secreto e maior!! - {tentativas} tentativas")
        os.system("cls" or "clear")
    else:
        print(f"o numero secreto e menor {tentativas} tentativas")        