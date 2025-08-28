package CadastroBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    ArrayList<Cadastro> banco = new ArrayList<>();
    ArrayList<Cadastro> Cache = new ArrayList<>();

    Cadastro cad = new Cadastro();
    Scanner input = new Scanner(System.in);


    banco.add(new Cadastro("Andre",  1, 22));
    banco.add(new Cadastro("Luiz",  2, 19));
    banco.add(new Cadastro("Bernado",  3, 18));
    banco.add(new Cadastro("David",  4, 27));
    banco.add(new Cadastro("Silas",  5, 19));




    int opc = 0;


while (true) {
    System.out.println("\nBem vindo a o Banco Senai! \n Escolha um opção abaixo! \n [1] Ver lista de cadastro \n [2] Analisar um cadastro\n [3] Cache");


    opc = input.nextInt();
    switch (opc) {
        case 1:
            for (Cadastro cadastro : banco) {
                System.out.println(cadastro);
            }
            break;
        case 2:
            System.out.println("Digite o id que você quer ver :");
            int id = input.nextInt();
            boolean cache = false;
            for (Cadastro cadastro : banco) {
                if (cadastro.getId() == id) {
                    System.out.println("Cadastro encontrado: " + cadastro);
                    Cache.add(cadastro);

                    if (!Cache.contains(cadastro)) {
                        System.out.println("Cadastro adicionado no cache ");
                    } else {
                        System.out.println("Cadastro existente no cache ");
                    }
                    cache = true;
                    break;


                }

            }
            if (!cache) {
                System.out.println("Cadastro com id inexistente");
            }
            break;
            case 3:
                for (Cadastro cadastro : Cache) {
                    System.out.println("Cache: "+cadastro);
                }
            default:
                System.out.println("Opção invalida");
                break;
    }

}
}
}
