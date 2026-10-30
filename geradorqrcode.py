import customtkinter as ctk
import qrcode
from PIL import Image
from tkinter import filedialog

# Configurações iniciais do tema
ctk.set_appearance_mode('dark')
ctk.set_default_color_theme('blue')

class QrCodeApp(ctk.CTk):
    def __init__(self):
        super().__init__()

        self.title('Gerador de QR Code Pro')
        self.geometry('450x700')
        self.resizable(False, False)
        
        self.imagem_qr_atual = None  # Armazena a imagem PIL para salvar depois
        self.construir_interface()

    def construir_interface(self):
        # Título
        self.titulo = ctk.CTkLabel(self, text='QR Code Generator', font=('Segoe UI', 28, 'bold'))
        self.titulo.pack(pady=(30, 20))

        # Frame Principal (Card)
        self.frame_principal = ctk.CTkFrame(self, fg_color="transparent")
        self.frame_principal.pack(padx=20, pady=10, fill="both", expand=True)

        # Entrada de Dados
        self.entrada = ctk.CTkEntry(self.frame_principal, 
                                    width=350, 
                                    height=45, 
                                    placeholder_text='Cole sua URL, Texto ou Chave PIX aqui',
                                    font=('Segoe UI', 14))
        self.entrada.pack(pady=(0, 20))

        # Frame para Opções (Ex: Cor do QR Code)
        self.frame_opcoes = ctk.CTkFrame(self.frame_principal, fg_color="transparent")
        self.frame_opcoes.pack(pady=(0, 20))
        
        self.label_cor = ctk.CTkLabel(self.frame_opcoes, text="Cor do QR Code:", font=('Segoe UI', 12))
        self.label_cor.grid(row=0, column=0, padx=10)
        
        self.seletor_cor = ctk.CTkOptionMenu(self.frame_opcoes, 
                                             values=["Preto", "Azul Escuro", "Verde"],
                                             width=120)
        self.seletor_cor.grid(row=0, column=1, padx=10)

        # Frame de Botões
        self.frame_botoes = ctk.CTkFrame(self.frame_principal, fg_color="transparent")
        self.frame_botoes.pack(pady=(0, 20))

        self.btn_gerar = ctk.CTkButton(self.frame_botoes, 
                                       text='Gerar QR Code', 
                                       height=40,
                                       font=('Segoe UI', 14, 'bold'),
                                       cursor='hand2',
                                       command=self.gerar_qrcode)
        self.btn_gerar.grid(row=0, column=0, padx=10)

        self.btn_salvar = ctk.CTkButton(self.frame_botoes, 
                                        text='Salvar Imagem', 
                                        height=40,
                                        fg_color="#2b9348",
                                        hover_color="#007f5f",
                                        font=('Segoe UI', 14, 'bold'),
                                        cursor='hand2',
                                        state="disabled", # Desativado até gerar um QR Code
                                        command=self.salvar_qrcode)
        self.btn_salvar.grid(row=0, column=1, padx=10)

        # Label para exibir o QR Code (fundo cinza escuro para destacar)
        self.frame_imagem = ctk.CTkFrame(self.frame_principal, width=220, height=220, corner_radius=15)
        self.frame_imagem.pack(pady=10)
        self.frame_imagem.pack_propagate(False) # Impede que o frame mude de tamanho

        self.resultado_img = ctk.CTkLabel(self.frame_imagem, text='Nenhum QR Code\ngerado ainda.', text_color="gray")
        self.resultado_img.place(relx=0.5, rely=0.5, anchor="center")

        # Barra de Status (Rodapé)
        self.status_bar = ctk.CTkLabel(self, text='Pronto', font=('Segoe UI', 12, 'italic'), text_color="gray")
        self.status_bar.pack(side="bottom", pady=10)

    def gerar_qrcode(self):
        texto = self.entrada.get().strip()
        
        if not texto:
            self.mostrar_status('Erro: O campo de texto não pode estar vazio!', 'red')
            return

        # Mapeamento de cores
        cores = {
            "Preto": "black",
            "Azul Escuro": "#003049",
            "Verde": "#004b23"
        }
        cor_escolhida = cores.get(self.seletor_cor.get(), "black")

        try:
            # Geração do QR Code
            qr = qrcode.QRCode(version=1, box_size=10, border=2)
            qr.add_data(texto)
            qr.make(fit=True)
            
            # Gera a imagem PIL
            self.imagem_qr_atual = qr.make_image(fill_color=cor_escolhida, back_color="white").convert('RGB')
            
            # Converte para o CustomTkinter e exibe
            imagem_ctk = ctk.CTkImage(light_image=self.imagem_qr_atual, dark_image=self.imagem_qr_atual, size=(200, 200))
            
            self.resultado_img.configure(image=imagem_ctk, text='')
            self.resultado_img.image = imagem_ctk
            
            # Habilita o botão de salvar e atualiza status
            self.btn_salvar.configure(state="normal")
            self.mostrar_status('QR Code gerado com sucesso!', '#38b000')
            
        except Exception as e:
            self.mostrar_status(f'Erro interno: {e}', 'red')

    def salvar_qrcode(self):
        if self.imagem_qr_atual:
            # Abre a janela do sistema operacional para salvar arquivo
            caminho_arquivo = filedialog.asksaveasfilename(
                defaultextension=".png",
                filetypes=[("PNG Image", "*.png"), ("All Files", "*.*")],
                title="Salvar QR Code"
            )
            
            if caminho_arquivo:
                try:
                    self.imagem_qr_atual.save(caminho_arquivo)
                    self.mostrar_status(f'Salvo em: {caminho_arquivo.split("/")[-1]}', '#38b000')
                except Exception as e:
                    self.mostrar_status(f'Erro ao salvar: {e}', 'red')

    def mostrar_status(self, mensagem, cor):
        self.status_bar.configure(text=mensagem, text_color=cor)


if __name__ == "__main__":
    app = QrCodeApp()
    app.mainloop()