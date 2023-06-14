import javax.swing.JOptionPane;

public class TrafficLightSwitch {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,
                "Digite o codigo da cor:\n 1 - Vermelho\n 2 - Verde\n 3 - Amarelo");
        int codigoCor = Integer.parseInt(input);

        String proximaCor;

        switch (codigoCor) {
            case 1:
                proximaCor = "Verde";
                break;
            case 2:
                proximaCor = "Amarelo";
                break;
            case 3:
                proximaCor = "Vermelho";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Codigo de cor inválido");
                return;
        }
        JOptionPane.showMessageDialog(null, "Próximo O semáforo está " + proximaCor);
    }
}
