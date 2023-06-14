import java.util.ArrayList;
import java.util.List;

class Terminal {
    private int dinheiro;
    private int tickets;
    private int creditosPorDolar;
    private List<Premio> premios;

    public Terminal(int creditosPorDolar) {
        this.dinheiro = 0;
        this.tickets = 0;
        this.creditosPorDolar = creditosPorDolar;
        this.premios = new ArrayList<>();
    }

    public void adicionarDinheiro(int valor) {
        dinheiro += valor;
        int creditosGanhos = valor * creditosPorDolar;
        tickets += creditosGanhos;
        System.out.println("Créditos adicionados: " + creditosGanhos);
        System.out.println("Saldo de tíquetes atual: " + tickets);
    }

    public void adicionarPremio(Premio premio) {
        premios.add(premio);
    }

    public void transferirCreditos(Cartao origem, Cartao destino, int quantidade) {
        if (origem.getSaldoCredito() >= quantidade) {
            origem.setSaldoCredito(origem.getSaldoCredito() - quantidade);
            destino.setSaldoCredito(destino.getSaldoCredito() + quantidade);
            System.out.println("Créditos transferidos do Cartão " + origem.getNumero() +
                    " para o Cartão " + destino.getNumero());
        } else {
            System.out.println("Saldo de créditos insuficiente no Cartão " + origem.getNumero());
        }
    }

    public void trocarPremio(Cartao cartao, Premio premio) {
        if (cartao.getSaldoTickets() >= premio.getTicketsNecessarios()) {
            if (premio.getQuantidade() > 0) {
                cartao.setSaldoTickets(cartao.getSaldoTickets() - premio.getTicketsNecessarios());
                premio.setQuantidade(premio.getQuantidade() - 1);
                System.out.println("Prêmio '" + premio.getNome() + "' concedido ao Cartão " + cartao.getNumero());
                System.out.println("Saldo de tíquetes restante: " + cartao.getSaldoTickets());
                System.out.println("Quantidade de prêmios restante: " + premio.getQuantidade());
            } else {
                System.out.println("Prêmio '" + premio.getNome() + "' indisponível no momento");
            }
        } else {
            System.out.println("Saldo de tíquetes insuficiente no Cartão " + cartao.getNumero());
        }
    }

    public void exibirPremiosDisponiveis() {
        System.out.println("Prêmios disponíveis:");
        for (Premio premio : premios) {
            System.out.println(premio.getNome() + " - Tíquetes necessários: " + premio.getTicketsNecessarios()
                    + ", Quantidade disponível: " + premio.getQuantidade());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Terminal [dinheiro=").append(dinheiro)
          .append(", tickets=").append(tickets)
          .append(", creditosPorDolar=").append(creditosPorDolar)
          .append(", premios=").append(premiosToString())
          .append("]");
        return sb.toString();
    }

    private String premiosToString() {
        StringBuilder sb = new StringBuilder();
        for (Premio premio : premios) {
            sb.append(premio).append(", ");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2); 
        }
        return sb.toString();
    }
}
