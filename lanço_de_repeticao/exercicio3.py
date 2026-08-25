nomes = []

print("digite os 5 nomes")

for i in range(5):
    nome=(input(f"nome {i+1}"))
    nomes.append(nome)
    
    

nomes.sort() 

print("nomes em ordem alfabetica")

for nome in nomes:
    print(nome)