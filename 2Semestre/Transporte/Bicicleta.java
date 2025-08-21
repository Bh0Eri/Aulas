package Transporte;

class Bicicleta extends Veiculos{
    public float calcularTempo(float distancia) {
        this.distancia = distancia;
        float tempo = distancia / 20;
        tempo = tempo*60;
        return tempo;
    }
}
