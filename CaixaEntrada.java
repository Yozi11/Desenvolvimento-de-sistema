package Interface;
import javax.swing.JOptionPane;

public class CaixaEntrada {
    public static void main(String[] args) {
        String nome =JOptionPane.showInputDialog("digite seu nome: ");
        JOptionPane.showMessageDialog(null,"ola,"+ nome+"!","saudaçao",JOptionPane.PLAIN_MESSAGE);
    }
    
}
