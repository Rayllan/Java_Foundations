import javax.swing.JOptionPane;

public class TrafficLightChecker {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Digite o codigo da cor:\n 1 - Vermelho\n 2 - Verde\n 3 - Amarelo");
        int codigoCor = Integer.parseInt(input);

        if (codigoCor == 1){   
            JOptionPane.showMessageDialog(null,"Próximo O semáforo está verde");
        } else if (codigoCor == 2){
            JOptionPane.showMessageDialog(null,"Próximo O semáforo está amarelo");
        }else if (codigoCor == 3){
            JOptionPane.showMessageDialog(null,"Próximo O semáforo está vermelho");
        }else{
            JOptionPane.showMessageDialog(null,"Codigo de cor inválido");
        }
    }
}
