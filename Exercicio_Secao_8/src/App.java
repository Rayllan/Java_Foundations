import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int[][] tabeladeClassificacao = new int[4][6];

        ArrayList<Jogo> listaJogos = new ArrayList<Jogo>();

        LigaFutebol liga = new LigaFutebol();
        liga.CriarLiga();

        Scanner sc = new Scanner(System.in);

        double temperatura;
        int semana = 1;
        int diasCongelantes = 3;

        double temperaturaMaisQuente = Double.MIN_VALUE;
        double somaTemperaturas = 0;
        int totalJogos = 0;

        do {
            try {

                System.out.println("Informe a temperatura da semana " + semana + ":");
                temperatura = sc.nextDouble();

                if (temperatura > temperaturaMaisQuente) {
                    temperaturaMaisQuente = temperatura;
                }

                if (temperatura > 10) {
                    diasCongelantes = 3;

                    Random rndmzr = new Random();

                    int placarT1 = rndmzr.nextInt(5);
                    int placarT2 = rndmzr.nextInt(5);

                    Equipe equipe1 = liga.obterEquipeRandomica();
                    Equipe equipe2 = liga.obterEquipeRandomica();

                    Jogo jogo1 = new Jogo(equipe1, equipe2, placarT1, placarT2, temperatura);

                    // classificação jogo 1
                    int time1ID = jogo1.getTime1().getID() - 1;
                    int time2ID = jogo1.getTime2().getID() - 1;

                    tabeladeClassificacao[time1ID][0] += jogo1.getPlacarTime1() == jogo1.getPlacarTime2() ? 1
                            : (jogo1.getPlacarTime1() > jogo1.getPlacarTime2() ? 3 : 0);
                    tabeladeClassificacao[time1ID][1] += jogo1.getPlacarTime1();
                    tabeladeClassificacao[time1ID][2] += jogo1.getPlacarTime2();
                    tabeladeClassificacao[time1ID][3] += jogo1.getPlacarTime1() > jogo1.getPlacarTime2() ? 1 : 0;
                    tabeladeClassificacao[time1ID][4] += jogo1.getPlacarTime1() < jogo1.getPlacarTime2() ? 1 : 0;

                    tabeladeClassificacao[time2ID][0] += jogo1.getPlacarTime2() == jogo1.getPlacarTime1() ? 1
                            : (jogo1.getPlacarTime2() > jogo1.getPlacarTime1() ? 3 : 0);
                    tabeladeClassificacao[time2ID][1] += jogo1.getPlacarTime2();
                    tabeladeClassificacao[time2ID][2] += jogo1.getPlacarTime1();
                    tabeladeClassificacao[time2ID][3] += jogo1.getPlacarTime2() > jogo1.getPlacarTime1() ? 1 : 0;
                    tabeladeClassificacao[time2ID][4] += jogo1.getPlacarTime2() < jogo1.getPlacarTime1() ? 1 : 0;

                    listaJogos.add(jogo1);

                    placarT1 = rndmzr.nextInt(5);
                    placarT2 = rndmzr.nextInt(5);

                    equipe1 = liga.obterEquipeRandomica();
                    equipe2 = liga.obterEquipeRandomica();

                    Jogo jogo2 = new Jogo(equipe1, equipe2, placarT1, placarT2, temperatura);

                    time1ID = jogo2.getTime1().getID() - 1;
                    time2ID = jogo2.getTime2().getID() - 1;

                    tabeladeClassificacao[time1ID][0] += jogo2.getPlacarTime1() == jogo2.getPlacarTime2() ? 1
                            : (jogo2.getPlacarTime1() > jogo2.getPlacarTime2() ? 3 : 0);
                    tabeladeClassificacao[time1ID][1] += jogo2.getPlacarTime1();
                    tabeladeClassificacao[time1ID][2] += jogo2.getPlacarTime2();
                    tabeladeClassificacao[time1ID][3] += jogo2.getPlacarTime1() > jogo2.getPlacarTime2() ? 1 : 0;
                    tabeladeClassificacao[time1ID][4] += jogo2.getPlacarTime1() < jogo2.getPlacarTime2() ? 1 : 0;

                    tabeladeClassificacao[time2ID][0] += jogo2.getPlacarTime2() == jogo2.getPlacarTime1() ? 1
                            : (jogo2.getPlacarTime2() > jogo2.getPlacarTime1() ? 3 : 0);
                    tabeladeClassificacao[time2ID][1] += jogo2.getPlacarTime2();
                    tabeladeClassificacao[time2ID][2] += jogo2.getPlacarTime1();
                    tabeladeClassificacao[time2ID][3] += jogo2.getPlacarTime2() > jogo2.getPlacarTime1() ? 1 : 0;
                    tabeladeClassificacao[time2ID][4] += jogo2.getPlacarTime2() < jogo2.getPlacarTime1() ? 1 : 0;

                    listaJogos.add(jogo2);

                } else {

                    diasCongelantes--;
                }
                somaTemperaturas += temperatura;
                totalJogos++;
                semana++;
            } catch (Exception e) {
                System.out.println("Erro! Informe uma temperatura válida:");
                sc.nextLine();
            }
        } while (diasCongelantes > 0);

        double temperaturaMedia = somaTemperaturas / totalJogos;

        System.out.println("A temporada terminou devido a 3 dias seguidos com temperaturas abaixo de 10.");

        System.out.println("Temperatura mais quente: " + temperaturaMaisQuente);
        System.out.println("Temperatura média da temporada: " + temperaturaMedia);

        System.out.println("Tabela de Classificação:");

        System.out.println("Equipe\t\tPontos\tGols Marcados\tGols Sofridos\tVitórias\tDerrotas");
        for (int i = 0; i < tabeladeClassificacao.length; i++) {
            String nomeEquipe = liga.getNomeEquipe(i + 1);

            if (nomeEquipe != null) {
                System.out.printf("%-15s", nomeEquipe);
            } else {
                System.out.printf("%-15s", "Equipe " + (i + 1));
            }

            System.out.printf("%d\t%d\t\t%d\t\t%d\t\t%d\n", tabeladeClassificacao[i][0],
                    tabeladeClassificacao[i][1], tabeladeClassificacao[i][2], tabeladeClassificacao[i][3],
                    tabeladeClassificacao[i][4]);
        }

        sc.close();
    }
}