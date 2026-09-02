while True:
    try:
        nota1 = float(input("digite a primeira nota: "))
        nota2 = float(input("digite a segunda nota: "))
        nota3 = float(input("digite a terceira nota: "))
        
        media = (nota1 + nota2 + nota3)/3
        
        print(f"\nmedia final: {media:.2f} ")
        
        if media >=7:
            print("voce foi aprovado")
        elif 5 <= media <= 6.9:
            print("recuperação")
        else:
            print("perdeu de ano")
            break    
    except:
        print("valor invalido, digite so numero")            
        
        
        