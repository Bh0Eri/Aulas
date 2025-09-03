package Abstracao;

abstract class SerVivo {
    private Cores cor;
    private int peso;

    public Cores getCor() {
        return cor;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    abstract void respirar();


}