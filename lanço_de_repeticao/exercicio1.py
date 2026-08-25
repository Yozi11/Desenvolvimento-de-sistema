negativos = []
positivos = []


for i in range(10):
    num = int(input(f"digite o {i+1}ºnumero "))
    if(num>=0):
        positivos.append(num)
    else:
        negativos.append(num)
            

quantidade_positivo = len(positivos)
qunatidade_negativo = len(negativos)
soma = sum(positivos)

print(f"a quantidade de negativos e {qunatidade_negativo}")
print(f"quantidade de positivos e{quantidade_positivo}")
print(f"A soma dos positivos e {soma}")
    
    
  

    



        


