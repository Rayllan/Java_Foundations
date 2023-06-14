import javax.swing.JOptionPane;

public class ValidadorPIN {
    public static void main(String[] args) {
        int pinCorreto = 3333;
        int pinInserido;

        JOptionPane.showMessageDialog(null, "Bem-vindo! Insira o seu PIN:");

        while (true) {
            pinInserido = Integer.parseInt(JOptionPane.showInputDialog("Insira o PIN"));

            if (pinInserido == pinCorreto) {
                JOptionPane.showMessageDialog(null, "PIN correto inserido. Acesso concedido.");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "PIN incorreto. Tente novamente.");
            }
        }
    }
}
