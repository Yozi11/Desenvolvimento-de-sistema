notas = []
notas_acima = []


print("digite a nota de 8 alunos")

for i in range(8):
    nota = float(input(f"nota do aluno {i+1}: "))
    notas.append(nota)
    
    


media = sum(notas)/len(notas)


for nota in notas:
    if nota > media:
        notas_acima.append(nota)
        
            
print(f"a media aritmetica da turma {media:.2f}")
print(f"notas acima da media: {notas_acima}")            
    

    