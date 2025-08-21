package Transporte;

class Onibus extends Veiculos{
    public float calcularTempo(float distancia, int parada) {
        this.distancia = distancia;
        float tempo = (distancia / 60) + (parada*15);
        tempo = tempo*60;
        return tempo;
    }
}
