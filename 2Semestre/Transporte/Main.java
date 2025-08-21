package Transporte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bicicleta bic = new Bicicleta();
        Veiculos Vei = new Veiculos();
        Carro Car = new Carro();
        Onibus Oni = new Onibus();

        Scanner sc = new Scanner(System.in);

        System.out.println("Em qual veiculo o senhor está usando? \n[1] Bicicleta\n[2] Carro\n[3] Onibus\n[4] Estou a pé");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Distancia?");
                Vei.tempo(bic.calcularTempo(sc.nextFloat()));
                break;
                case 2:
                    System.out.println("Distancia?");
                    Vei.tempo(Car.calcularTempo(sc.nextFloat()));
                    break;
                    case 3:
                        System.out.println("Paradas?");
                        int p = sc.nextInt();
                        System.out.println("Distancia?");
                        Vei.tempo(Oni.calcularTempo(sc.nextFloat(),p));
                        break;
                        default:
                            break;
        }
        System.out.println("Muito obrigado por usar nosso app!");
    }
}
