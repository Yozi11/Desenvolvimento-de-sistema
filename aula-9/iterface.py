import customtkinter as ctk
ctk.set_appearance_mode ("Dark")
#janela ------
janela =ctk.CTk()
janela.geometry("500x300")
janela.resizable(False,False)
janela.title("Sistema de Acesso - 2026")
janela.iconbitmap("aula-9/40_104848.ico")

#------------------------------------------
# corpo da janela -----------

titulo = ctk.CTkLabel(janela,
                      text="Sistema de login",
                      text_color="#1340E2",
                      font=("arial",50))
titulo.pack()

login = ctk.CTkEntry(janela,
                     width=450,
                     height=45,
                     border_color="#1340E2",
                     placeholder_text="Digite seu login: ",
                     show = "•")
login.pack(pady=40)
Senha = ctk.CTkEntry(janela,
                     width=450,
                     height=45,
                     border_color="#1340E2",
                     placeholder_text="Digite sua senha: ",
                     show = "•")
Senha.pack()




botao = ctk.CTkButton(janela,
                      width=250,
                      height=45,
                      text="Acessar",
                      fg_color="#1340E2",
                      text_color="black",
                      cursor="hand2",
                      font=("arial",30))

botao.pack(pady=30)








janela.mainloop()