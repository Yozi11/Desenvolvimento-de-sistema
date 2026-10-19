package view;

import javax.swing.*;

import controller.LoginController;

import java.awt.*;

public class TelaLogin extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;
    private LoginController loginController;

    public TelaLogin() {
        loginController = new LoginController();
        initComponents();
    }

    private void initComponents() {
        setTitle("Login - Sistema");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a tela
        setLayout(new GridLayout(3, 1, 10, 10));

        // Painel Usuário
        JPanel panelUsuario = new JPanel(new FlowLayout());
        panelUsuario.add(new JLabel("Usuário:"));
        txtUsuario = new JTextField(15);
        panelUsuario.add(txtUsuario);

        // Painel Senha
        JPanel panelSenha = new JPanel(new FlowLayout());
        panelSenha.add(new JLabel("Senha:  "));
        txtSenha = new JPasswordField(15);
        panelSenha.add(txtSenha);

        // Painel Botão
        JPanel panelBotao = new JPanel(new FlowLayout());
        btnEntrar = new JButton("Entrar");
        panelBotao.add(btnEntrar);

        // Adiciona os painéis na tela
        add(panelUsuario);
        add(panelSenha);
        add(panelBotao);

        // Ação do botão Entrar
        btnEntrar.addActionListener(e -> realizarLogin());
    }

    private void realizarLogin() {
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());

        // Usa o seu controller para validar
        if (loginController.fazerLogin(usuario, senha)) {
            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            // Abre a tela de produtos e fecha o login
            new TelaProduto().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }
}