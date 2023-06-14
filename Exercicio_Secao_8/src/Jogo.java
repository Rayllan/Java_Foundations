public class Jogo {

    private int PlacarTime1;
    private int PlacarTime2;
    private double temperatura;
    private int ID;
    private Equipe time1;
    private Equipe time2;

    private static int _ID = 0;

    private static int GeraID() {
        _ID++;
        return _ID;
    }

    public Jogo() {

    }

    public Jogo(Equipe equipe1, Equipe equipe2, int p1, int p2, double temperatura) {
        this.time1 = equipe1;
        this.time2 = equipe2;
        this.PlacarTime1 = p1;
        this.PlacarTime2 = p2;
        this.temperatura = temperatura;
        this.ID = Jogo.GeraID();
    }
// classificação 
    public void atualizarTabela() {
        time1.setGolsMarcados(PlacarTime1);
        time1.setGolsSofridos(PlacarTime2);
        time2.setGolsMarcados(PlacarTime2);
        time2.setGolsSofridos(PlacarTime1);
    
        if (PlacarTime1 > PlacarTime2) {
            time1.setPontos(time1.getPontos() + 3);
        } else if (PlacarTime1 < PlacarTime2) {
            time2.setPontos(time2.getPontos() + 3);
        } else {
            time1.setPontos(time1.getPontos() + 1);
            time2.setPontos(time2.getPontos() + 1);
        }
    }    

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getPlacarTime1() {
        return PlacarTime1;
    }

    public void setPlacarTime1(int placarTime1) {
        PlacarTime1 = placarTime1;
    }

    public int getPlacarTime2() {
        return PlacarTime2;
    }

    public void setPlacarTime2(int placarTime2) {
        PlacarTime2 = placarTime2;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Equipe getTime1() {
        return time1;
    }

    public void setTime1(Equipe time1) {
        this.time1 = time1;
    }

    public Equipe getTime2() {
        return time2;
    }

    public void setTime2(Equipe time2) {
        this.time2 = time2;
    }
}