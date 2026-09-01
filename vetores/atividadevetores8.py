notas = []

while True:
    entrada = float(input("digite uma nota"))
    
    if entrada == -1:
        break
    
    
    notas.append(entrada)
    
if len(notas) > 0:
    print("\nnotas cadastradas")
    for nota in notas:
        print(f"notas: {nota}")
        
        
    quantidade = len(notas)
    media = sum(notas)/ quantidade
    maior_nota = max(notas)
    menor_notas = min(notas)
    
    
    notas.sort(reverse=True)
    
    
    print(f"a quantidade de notas: {quantidade}")
    print(f"medias das notas{media:2f}")
    print(f"a maior nota: {maior_nota} ")
    print(f"a menor nota: {menor_notas}")
    print(f"a notas em ordem decrescente: {notas}")
else:
    print("\nNenhuma nota foi cadastrada")            