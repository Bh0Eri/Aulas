package Rpg;

public class Player extends Creature {
    private String classe;
    private int xp;
    private int xpThreshold;

    public Player(String nome, String classe) {
        super(nome, /* vida inicial */100, 1, 5, 20);
        this.classe = classe;
        this.xp = 0;
        defineClasseAtributos();
        recalculaXpThreshold();
    }

    private void defineClasseAtributos() {
        switch (classe.toLowerCase()) {
            case "mago":
                vida += 10;
                break;
            case "arqueiro":
                vida += 20;
                break;
            case "guerreiro":
                vida += 30;
                break;
            default:
                throw new IllegalArgumentException("Classe inválida!");
        }
    }

    private void recalculaXpThreshold() {
        xpThreshold = nivel * 100;
    }

    public void ganharXp(int xpGanho) {
        xp += xpGanho;
        if (xp >= xpThreshold) {
            xp -= xpThreshold;
            nivel++;
            vida += rm.nextInt(1, 20);
            recalculaXpThreshold();
            System.out.println("Você upou para o nível " + nivel + "! Vida atual: " + vida);
        } else {
            System.out.println("Faltam " + (xpThreshold - xp) + " pontos de XP para upar");
        }
    }
}
