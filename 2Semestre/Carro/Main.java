package Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Veiculo v = new Veiculo();
        Carro c = new Carro();
        System.out.println("O que deseja fazer?\n [1] ligar o carro\n [2] Ir embora");
        int opcao = sc.nextInt();
        if(opcao == 1){
            c.Iniciar();
        }else{

            System.out.println("Erro");
        }
        sc.close();
    }
}
