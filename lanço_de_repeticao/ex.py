temperatura = []

for i in range (5):
    temp = float(input(f"digite a {i+1}ª temperatura"))
    temperatura.append(temp)
    
    
media = sum(temperatura)/len(temperatura)
menor = min(temperatura)
maior = max(temperatura)

print(f"A maior temperatura do dia foi {maior}º")
print(f"A menor temperatura do dia foi {menor}º")
print(f"A media temperatura do dia foi {media:.1f}º")
    
    