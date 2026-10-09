import customtkinter as ctk

ctk.set_appearance_mode("Dark")

def calcular():
    try:
        nome = Hospede.get()
        diarias = int(Diaria.get())
        valor_diaria = float(Valor.get().replace(",", "."))
        
        
        valor_hospedagem = diarias * valor_diaria
        
        if diarias >= 5:
            desconto = valor_hospedagem * 0.10
        else:
            desconto = 0.0
            
        total_pagar = valor_hospedagem - desconto
        
        resultado.configure(text=f"Hospedagem: R$ {valor_hospedagem:.2f}\n"
                 f"Desconto: R$ {desconto:.2f}\n"
                 f"Total a Pagar: R$ {total_pagar:.2f}",
            text_color="Green")
    except ValueError:
        resultado.configure(text="Digite apenas números válidos!", text_color="red")
           
     

janela = ctk.CTk()

janela.geometry("500x600")
janela.resizable(False,False)
janela.title("Reserva de hotel")
janela.iconbitmap("")


titulo = ctk.CTkLabel(janela,
                      text="Sistema de Hotel",
                      text_color="blue",
                      font=("Arial",50))
titulo.pack()



Hospede = ctk.CTkEntry(janela,
                       width=450,
                       height=45,
                       border_color="Blue",
                       placeholder_text="Digite o nome do hospede")
Hospede.pack(pady=40)


Diaria = ctk.CTkEntry(janela,
                       width=450,
                       height=45,
                       border_color="Blue",
                       placeholder_text="Digite a quantidade de diaria")
Diaria.pack(pady=40)

Valor = ctk.CTkEntry(janela,
                       width=450,
                       height=45,
                       border_color="Blue",
                       placeholder_text="Digite o valor da diaria")
Valor.pack(pady=40)

resultado = ctk.CTkLabel(janela,
                         text="",
                         text_color="white",
                         font=("Arial", 20, "bold"))
resultado.pack(pady=10)

botao = ctk.CTkButton(janela,
                      width=300,
                      height=45,
                      text="CALCULAR HOSPEDAGEM",
                      fg_color="Blue",
                      cursor="hand2",
                      font=("Arial", 18, "bold"),
                      command=calcular,
                      hover_color="blue")
botao.pack(pady=25)

janela.mainloop()

