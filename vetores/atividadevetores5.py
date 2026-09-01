nomes = []

while True:
    entrada = input("digite um nome ou digite fim para sair ")
    
    if entrada.lower()=="fim":
        break
    nomes.append(entrada)
    
    

nomes.sort()

print(f"lista de nomes{nomes}")
print(f"quantidade de nomes: {len(nomes)}")    
    
    
    
    