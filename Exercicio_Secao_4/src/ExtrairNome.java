import javax.swing.JOptionPane;

public class ExtrairNome {
    public static void main(String[] args) {
        String nomeCompleto = JOptionPane.showInputDialog("Digite o seu nome:");

        String[] partesNome = nomeCompleto.split(" ");
        String primeiroNome = partesNome[0];
        String ultimoNome = partesNome[partesNome.length - 1];

        String nomeFormatado = String.format("%s, %c.", ultimoNome, primeiroNome.charAt(0));

        JOptionPane.showMessageDialog(null, "Seu nome é: " + nomeFormatado);
    }
}
