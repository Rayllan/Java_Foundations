public class teste {
    public static void main(String[] args) {
        
        Cartao cartao1 = new Cartao(1);
        Cartao cartao2 = new Cartao(2);
        Jogo jogo1 = new Jogo(5);
        Jogo jogo2 = new Jogo(10);
        Terminal terminal = new Terminal(2);
        Premio premio1 = new Premio("Pelúcia", 50, 5);
        Premio premio2 = new Premio("Chaveiro", 20, 10);
        Premio premio3 = new Premio("Camiseta", 100, 2);
        terminal.adicionarPremio(premio1);
        terminal.adicionarPremio(premio2);
        terminal.adicionarPremio(premio3);

        cartao1.setSaldoCredito(20);
        cartao2.setSaldoCredito(30);

        System.out.println("Cartão 1:");
        jogo1.jogar(cartao1);
        jogo2.jogar(cartao1);
        System.out.println();

        System.out.println("Cartão 2:");
        jogo1.jogar(cartao2);
        jogo2.jogar(cartao2);
        System.out.println();

        cartao2.setSaldoCredito(cartao2.getSaldoCredito() + cartao1.getSaldoCredito());
        cartao2.setSaldoTickets(cartao2.getSaldoTickets() + cartao1.getSaldoTickets());
        cartao1.setSaldoCredito(0);
        cartao1.setSaldoTickets(0);

        System.out.println("Cartão 1 (após transferência):");
        System.out.println("Saldo de créditos: " + cartao1.getSaldoCredito());
        System.out.println("Saldo de tíquetes: " + cartao1.getSaldoTickets());
        System.out.println();

        System.out.println("Cartão 2 (após transferência):");
        System.out.println("Saldo de créditos: " + cartao2.getSaldoCredito());
        System.out.println("Saldo de tíquetes: " + cartao2.getSaldoTickets());
        System.out.println();

        System.out.println("Prêmios disponíveis:");
        terminal.exibirPremiosDisponiveis();
        terminal.trocarPremio(cartao2, premio1);
        terminal.trocarPremio(cartao2, premio2);
        terminal.trocarPremio(cartao2, premio3);
        System.out.println();

        System.out.println("Cartão 1:");
        jogo1.jogar(cartao1);
        terminal.trocarPremio(cartao1, premio1);
    }
}
