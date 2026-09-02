while True:
    try:
        valor_do_saque = float(input("digite o valor do sque"))
        
        saldo_disponivel = float(input("digite o valor do saldo disponivel: "))
        
        if valor_do_saque > 0:
            print("erro o valor do saque a maior que zero: ")
        elif valor_do_saque > saldo_disponivel:
            print("erro: saldo indiponivel")
        else:
            saldo_restante = saldo_disponivel - saldo_restante
            print("saque realizado com sucesso  ")
            print(f"saldo restante: {saldo_disponivel:.2f}")
    except:
        print("erro digite so numeros")               