import view.TelaLogin;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        // SwingUtilities.invokeLater garante que a interface gráfica seja iniciada na thread correta de forma segura
        SwingUtilities.invokeLater(() -> {
            TelaLogin telaDeLogin = new TelaLogin();
            telaDeLogin.setVisible(true);
        });
    }
}