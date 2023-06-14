import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LigaFutebol {

    List<Jogo> listaJogos = new ArrayList<Jogo>();
    List<Equipe> equipesSelecionadas = new ArrayList<Equipe>();
    List<Equipe> equipesLiga = new ArrayList<>();

    public String getNomeEquipe(int id) {
        for (Equipe equipe : equipesSelecionadas) {
            if (equipe.getID() == id) {
                return equipe.getNome();
            }
        }
        return null;
    }

    public void CriarLiga() {
        equipesLiga.add(new Equipe("Omega", 1));
        equipesLiga.add(new Equipe("Arcane", 2));
        equipesLiga.add(new Equipe("Dragonfire", 3));
        equipesLiga.add(new Equipe("Mystic", 4));
    }

    public Equipe obterEquipeRandomica() {
        if (equipesLiga.isEmpty()) {
            reinserirEquipes();
            if (equipesLiga.isEmpty()) {
                return null;
            }
        }

        Random random = new Random();
        int indice = random.nextInt(equipesLiga.size());
        Equipe equipeSelecionada = equipesLiga.remove(indice);
        equipesSelecionadas.add(equipeSelecionada);
        return equipeSelecionada;
    }

    private void reinserirEquipes() {
        equipesLiga.addAll(equipesSelecionadas);
        equipesSelecionadas.clear();
    }
}
