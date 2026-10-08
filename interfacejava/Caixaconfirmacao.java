package Interface;
import javax.swing.JOptionPane;

public class Caixaconfirmacao {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null,"Deseja continuar?","confirmaçao",JOptionPane.YES_NO_OPTION);

        if (resposta==JOptionPane.YES_OPTION) {

            JOptionPane.showMessageDialog(null,"voce escolheu sim","Resultado",JOptionPane.INFORMATION_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null, "voce escolheu nao","Resultado",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
