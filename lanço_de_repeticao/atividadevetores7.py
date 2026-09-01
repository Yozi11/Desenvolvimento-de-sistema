# Criação da lista vazia
notas = []

# Laço infinito para cadastro de notas
while True:
    entrada = float(input("Digite uma nota (ou -1 para encerrar): "))
    
    # Condição de parada
    if entrada == -1:
        break
        
    # Inclusão da nota na lista
    notas.append(entrada)

# Verifica se alguma nota foi cadastrada antes de fazer os cálculos
if len(notas) > 0:
    # Exibição de cada nota cadastrada usando o laço for
    print("\n--- Notas Cadastradas ---")
    for nota in notas:
        print(f"Nota: {nota}")
        
    # Cálculos estatísticos
    quantidade = len(notas)
    media = sum(notas) / quantidade
    maior_nota = max(notas)
    menor_nota = min(notas)
    
    # Ordenação em ordem decrescente (do maior para o menor)
    notas.sort(reverse=True)
    
    # Exibição dos resultados finais
    print("\n--- Análise Estatística ---")
    print(f"Quantidade de notas: {quantidade}")
    print(f"Média das notas: {media:.2f}")
    print(f"Maior nota: {maior_nota}")
    print(f"Menor nota: {menor_nota}")
    print(f"Notas em ordem decrescente: {notas}")
else:
    print("\nNenhuma nota foi cadastrada.")
