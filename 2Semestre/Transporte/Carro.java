package Transporte;

class Carro extends Veiculos {

    public float calcularTempo(float distancia) {
        this.distancia = distancia;
        float tempo = distancia / 80;
        tempo = tempo*60;
        return tempo;
    }
}
