package Rpg;

public abstract class Creature {
    protected String nome;
    protected int vida;
    protected int nivel;
    protected int ataqueMin;
    protected int ataqueMax;
    protected java.util.Random rm = new java.util.Random();

    public Creature(String nome, int vida, int nivel, int ataqueMin, int ataqueMax) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.ataqueMin = ataqueMin;
        this.ataqueMax = ataqueMax;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public int atacar() {
        return rm.nextInt(ataqueMax - ataqueMin + 1) + ataqueMin;
    }

    public void receberDano(int dano) {
        vida = Math.max(0, vida - dano);
    }

    public void curar(int cura) {
        vida += cura;
    }

    public String status() {
        return nome + " — Nível " + nivel + " | Vida: " + vida;
    }
}
