class Cartao {
    private int numero;
    private int saldoCredito;
    private int saldoTickets;

    public Cartao(int numero) {
        this.numero = numero;
        this.saldoCredito = 0;
        this.saldoTickets = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldoCredito() {
        return saldoCredito;
    }

    public void setSaldoCredito(int saldoCredito) {
        this.saldoCredito = saldoCredito;
    }

    public int getSaldoTickets() {
        return saldoTickets;
    }

    public void setSaldoTickets(int saldoTickets) {
        this.saldoTickets = saldoTickets;
    }
}
