# for x in range(100):
#     print(f"vitor - {x}")


# for x in range(61):
#     if x % 2 != 0:
#         print(f"{x}")
# for x in range(61):
#     if x % 2 == 0:
#         print(f"{x}")


# x = 0

# while True:
#     x+=1
#     print(f"Vitor - {x}")



carrinho = []

while True:
    produto = float(input("digite o valor do produto:"))
    if (produto == 0):
        break
    else:
        carrinho.append(produto)
        
        
total = sum(carrinho)
print(f"O valor total de compra e R$:{total:.2f} ")        
    
        
        