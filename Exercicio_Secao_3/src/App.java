import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você está:"));
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu Nascimento:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));

        int idade = anoAtual - anoNascimento;
        double IMC =peso / (altura * 2);  

        JOptionPane.showMessageDialog(null, String.format("%s\nVocê tem %d anos\nSeu IMC é de %.2f", nome, idade, IMC));
        
    }
}
