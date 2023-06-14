import javax.swing.JOptionPane;

public class ColorRange {
    public static void main(String[] args) throws Exception {

        String input = JOptionPane.showInputDialog("Digite o valor do comprimeto da onda:");
        double comprimentoValor = Double.parseDouble(input);

        if (comprimentoValor > 380 && comprimentoValor < 450) {
            JOptionPane.showMessageDialog(null, "A cor é Violeta");
        } else if (comprimentoValor > 450 && comprimentoValor < 495) {
            JOptionPane.showMessageDialog(null, "A cor é Azul");
        } else if (comprimentoValor > 495 && comprimentoValor < 570) {
            JOptionPane.showMessageDialog(null, "A cor é Verde");
        } else if (comprimentoValor > 570 && comprimentoValor < 590) {
            JOptionPane.showMessageDialog(null, "A cor é Amarelo");
        } else if (comprimentoValor > 590 && comprimentoValor < 620) {
            JOptionPane.showMessageDialog(null, "A cor é Laranja");
        } else if (comprimentoValor > 620 && comprimentoValor < 750) {
            JOptionPane.showMessageDialog(null, "A cor é Vermelho");
        } else {
            JOptionPane.showMessageDialog(null, "o valor infomado não corresponde a nenhuma cor!");
        }
    }
}
