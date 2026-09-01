tarefas = []


while True:
    print("----menu------")
    print("1- adicionar tarefa")
    print("2-remover tarefa")
    print("3- mostrar tarefa")
    print("0- sair")
    
    
    opcao = input("digite a opcao")
    
    if opcao == "1":
        nova_tarefa = input("digite a tarefa")
        tarefas.appen(nova_tarefa)
        print(f"tarefa{nova_tarefa} nova tarefa foi adicionada" )
    elif opcao == "2":
        if len(tarefas) == 0:
            print("lista esta vazia")
        else:
            tarefa_remover = input("digite o nome exto da tarefa que deseja remover:")
            if tarefa_remover in tarefas:
                tarefas.remove(tarefa_remover)
                print(f"tarefa {tarefa_remover} removida!") 

            else:
                print("tarefa nao encontrada na lista ")
    elif opcao == "3":
        if len(tarefas) == 0:
            print("nenhuma tarefa cadastrada no momento")
        else:
            print("\n--suas tarefas---") 
            for indice, tarefa in enumerate(tarefas, start=1):
                print(f"{indice}.{tarefas}")
    elif opcao == "0":
        print("saindo do programa..... ")
        break                      
    
    
    else:
        print("opcao invalida")                    
    
    
    
    

    
    
