lista_numeros = [12,7,9,20,31,44,18,5]

quantidade_pares = 0
quantidade_impares = 0


for num in lista_numeros:
    if num % 2 == 0:
        quantidade_pares +=1
    else:
        quantidade_impares +=1 
        
        
print(f"a quantidade de numeros pares e {quantidade_pares}") 
print(f"a quantidade de numeros impares e {quantidade_impares}")       
        
         
    