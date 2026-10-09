import customtkinter as ctk

ctk.set_appearance_mode("Dark")

def calcular():
    try:
        u1 = float(Unidade1.get())
        u2 = float(Unidade2.get())
        
        media = (u1+u2)/2
        
        if media >= 7:
            status = "Aprovado"
            cor = "Green"
        elif 5 <= media < 7.0:
            status = "recuperaçao"
            cor = "Yellow"
        else:
            status = "reprovado"
            cor= "red"
        
        
        resultado.configure(text = f"A sua nota e {media:.2f} {status} ",text_color=cor)
    
    except ValueError:
        resultado.configure(text=f"Digite apenas numero {status} {cor}")            
             





#janela
janela = ctk.CTk()

janela.geometry("500x600")
janela.resizable(False,False)
janela.title("Sistema Academico Escolar - 2026")
janela.iconbitmap("")


titulo = ctk.CTkLabel(janela,
                      text="Sistema Escolar",
                      text_color="Blue",
                      font=("Arial",50))
titulo.pack()

Aluno = ctk.CTkEntry(janela,
                     width=450,
                     height=45,
                     border_color="blue",
                     placeholder_text="Digite o nome do aluno")
Aluno.pack(pady=40)


Unidade1 = ctk.CTkEntry(janela,
                        width=450,
                        height=45,
                        border_color="Blue",
                        placeholder_text="Digite a 1º nota")
Unidade1.pack(pady=40)
Unidade2 = ctk.CTkEntry(janela,
                        width=450,
                        height=45,
                        border_color="Blue",
                        placeholder_text="Digite a 2º nota")
Unidade2.pack(pady=40)

botao = ctk.CTkButton(janela,
                      width=250,
                      height=40,
                      text="Resultado",
                      fg_color="Blue",
                      cursor="hand2",
                      font=("arial",30),
                      command=calcular,
                      hover_color="blue")
botao.pack(pady=30)

resultado = ctk.CTkLabel(janela,
                         text="",
                         text_color="white",
                         font=("arial",20))
resultado.pack(pady=10)





janela.mainloop()