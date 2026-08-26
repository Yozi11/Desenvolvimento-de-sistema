while True:
    senha = input("digite a senha 4 digitos: ")
    
    
    if len(senha)== 4 and senha.isdigit():
        print("senha cadastrada com sucesso")
        break
    else:
        print("senha invalida")    
        