import java.util.Random;

class Jogo {
    private int creditosNecessarios;
    private Random random;

    public Jogo(int creditosNecessarios) {
        this.creditosNecessarios = creditosNecessarios;
        this.random = new Random();
    }

    public int getCreditosNecessarios() {
        return creditosNecessarios;
    }

    public int jogar(Cartao cartao) {
        if (cartao.getSaldoCredito() < creditosNecessarios) {
            System.out.println("Cartão não possui créditos suficientes para jogar.");
            return 0;
        }

        cartao.setSaldoCredito(cartao.getSaldoCredito() - creditosNecessarios);
        int ticketsGanhos = random.nextInt(100);
        cartao.setSaldoTickets(cartao.getSaldoTickets() + ticketsGanhos);

        System.out.println("Número do cartão: " + cartao.getNumero());
        System.out.println("Tíquetes ganhos: " + ticketsGanhos);
        System.out.println("Novo total de tíquetes: " + cartao.getSaldoTickets());

        return ticketsGanhos;
    }
}