class Premio {
    private String nome;
    private int ticketsNecessarios;
    private int quantidade;

    public Premio(String nome, int ticketsNecessarios, int quantidade) {
        this.nome = nome;
        this.ticketsNecessarios = ticketsNecessarios;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getTicketsNecessarios() {
        return ticketsNecessarios;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}