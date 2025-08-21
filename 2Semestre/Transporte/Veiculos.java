package Transporte;

public class Veiculos {
    String modelo;
    float distancia;
    float tempo;
    public float calcularTempo(float distancia, float velocidade){
        this.distancia = distancia;
        float tempo = distancia / velocidade;
        return tempo;
    }
    public void tempo(float tempo){
        this.tempo = tempo;
        int resto = (int) (tempo%60);
        int hora = (int) tempo/60;
        System.out.println("o tempo total é: " + hora +" Horas e "+resto+" Minutos");
    }
}
