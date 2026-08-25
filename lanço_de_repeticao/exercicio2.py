import random, os
os.system("cls" or clear)

nomes = []


print("digite 10 nomes: ")

for i in range(17):
    nome = input(f"nome{i+1}")
    nomes.append(nome)
    
    
    
nome_sorteado = random.choice(nomes)


print(f"o nome sorteado foi {nome_sorteado}")    
    