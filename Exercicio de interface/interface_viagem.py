import customtkinter as ctk

ctk.set_appearance_mode ("Dark")

# funçoes
def calcular():
    d = int(Distancia.get())#convertendo para um numero inteiro. 
    c = float(consumo.get())#convertendo para numero inteiro.
    p = float(preco.get())#convertendo para numero inteiro.
    
    formula =(d/c)*p #calculo ou relação
    resultado.configure(text=f"o valor  para a viagem e de R$: {formula:.2f}")




#janela ----
janela = ctk.CTk()
janela.geometry("600x500")
janela.title("Calculadora de viagem")
janela.iconbitmap("Exercicio de interface/car_13260.ico")

#-------------------------------------------------------------
#corpo da janela ---------

titulo = ctk.CTkLabel(janela,
                      text="App de viagem",
                      text_color="#F6F8FF",
                      font=("Verdana",60))
titulo.pack()

Distancia = ctk.CTkEntry(janela,
                     width=450,
                     height=40,
                     border_color="#F4F4FF",
                     placeholder_text="Digite a dinamica da viagem em KM ",
                     )
Distancia.pack(pady=20)
consumo = ctk.CTkEntry(janela,
                     width=450,
                     height=45,
                     border_color="#F7F7F7",
                     placeholder_text="Digite o consumo de seu veiculo",
                     )
consumo.pack(pady = 40)


preco = ctk.CTkEntry(janela,
                     width=450,
                     height=45,
                     border_color="#F3F3F3",
                     placeholder_text="Digite o preço atual do combustivel",
                     )
preco.pack()


botao = ctk.CTkButton(janela,
                      width=250,
                      height=40,
                      text="Calcular gastos",
                      fg_color="red",
                      text_color="white",
                      cursor="hand2",
                      font=("arial",30),
                      command=calcular) # para calcular

botao.pack(pady=20)

resultado = ctk.CTkLabel(janela,
                         text="",#texto para calcular
                         text_color="white",
                         font=("arial",20))

resultado.pack(pady=10)

janela.mainloop()