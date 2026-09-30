import customtkinter as ctk
ctk.set_appearance_mode ("Dark")

def calcular():
    try:
        u1 = float(Unidade1.get())
        u2 = float(Unidade2.get())
        u3 = float(Unidade3.get())
    
        media = (u1+u2+u3)/3
        
        
        if media >= 5:
            status = "Esta aprovado"
            cor_status = "Grenn"
        else:
            status = " Recuperaçao"
            cor_status = "Red"
            
       
        resultado.configure(text=f"A sua nota e {media:.2f} {status} {cor_status}")
    
    except ValueError:
        resultado.configure(text=f"Digite apenas numeros {status} {cor_status}")
        
    
    
    




# janela
janela = ctk.CTk()
janela.geometry("500x600")
janela.resizable(False,False)
janela.title("Sistema Escolar - 2026")
janela.iconbitmap("")



titulo = ctk.CTkLabel(janela,
                      text="Sistema Escola",
                      text_color="Yellow",
                      font=("Arial",50))
titulo.pack()

Unidade1 = ctk.CTkEntry(janela,
                     width=450,
                     height=45,
                     border_color="Yellow",
                     placeholder_text="Digite a nota da 1º unidade: ")
Unidade1.pack(pady=40)


Unidade2 = ctk.CTkEntry(janela,
                        width=450,
                        height=45,
                        border_color="Yellow",
                        placeholder_text="Digite a nota da 2º unidade")
Unidade2.pack(pady=30)
Unidade3 = ctk.CTkEntry(janela,
                        width=450,
                        height=45,
                        border_color="Yellow",
                        placeholder_text="Digite a nota da 3º unidade")
Unidade3.pack(pady=30)


botao = ctk.CTkButton(janela,
                      width=250,
                      height=40,
                      text="Resultado",
                      fg_color="Yellow",
                      cursor="hand2",
                      font=("arial",30),
                      command=calcular,
                      hover_color="black")#define a cor quando passa o mouse em cima do botao
botao.pack(pady=30)

resultado = ctk.CTkLabel(janela,
                         text="",
                         text_color="white",
                         font=("arial",20))
resultado.pack(pady=10)


janela.mainloop()