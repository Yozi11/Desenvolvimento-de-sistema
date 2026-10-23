import customtkinter as ctk
import qrcode
from PIL import Image

ctk.set_appearance_mode("dark")

janela = ctk.CTk()
janela.geometry("400x500")
janela.title("Sistema Gerador de QR Code")
janela.resizable(False, False)

imagem_qr = None # Corrigido: 'imagem_qr' em vez de 'imaagem_qr'

# Função para criar qrcode 
def gerar_qrcode():
    global imagem_qr
    texto = entrada.get()
    
    if texto != "":
        # Gera e redimensiona o QR Code
        qr = qrcode.make(texto)
        
        # Corrigido: Usar CTkImage que é o padrão do CustomTkinter
        imagem_qr = ctk.CTkImage(light_image=qr, size=(300, 300))
        
        # Corrigido: 'text=""' em vez de 'tex=""'
        resultado.configure(image=imagem_qr, text="")
    else:
        # Limpa a imagem se o campo estiver vazio e mostra o aviso
        resultado.configure(text="Digite o texto ou um pix", image="")    

# Elementos da Janela -----------
titulo = ctk.CTkLabel(janela,
                      text="Sistema Gerador de QR Code",
                      text_color="yellow",
                      font=("arial", 25)) # Reduzi um pouco a fonte para caber na tela
titulo.pack(pady=10)

entrada = ctk.CTkEntry(janela,
                       width=300,
                       height=40,
                       placeholder_text="Digite a URL ou o Pix",
                       border_color="yellow")
entrada.pack(pady=10)

botao = ctk.CTkButton(janela,
                      width=300,
                      height=40,
                      fg_color="white",
                      text="Gerar QR Code",
                      text_color="black",
                      hover_color="silver",
                      cursor="hand2",
                      command=gerar_qrcode)
botao.pack(pady=10)

resultado = ctk.CTkLabel(janela, text="")
resultado.pack(pady=20)

janela.mainloop()