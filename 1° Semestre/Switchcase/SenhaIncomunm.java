package aula19_05;

import java.util.Scanner;

public class SenhaIncomunm {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ Bem Vindo ao validador de Senhas ------");
        System.out.println();
        System.out.println("Digite sua senha: ");
        System.out.print("> ");
        String senha = sc.nextLine();

        char[] especial = {'!', '@', '#', '$', '%', '&', '*'};
        String vogais = "aeiouAEIOU";
        boolean temEspecial = false;
        boolean temMaiusculo = false;
        boolean temNumeroPrimo = false;
        boolean semVogais = true;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            //Caracter Especial
            for (int j = 0; j < especial.length; j++) {
                if (c == especial[j]) {
                    temEspecial = true;
                    break;
                }
            }

            // Letra Maiuscula
            if (Character.isUpperCase(c)) {
                temMaiusculo = true;
            }

            //Numero Primo
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                if (num == 2 || num == 3 || num == 5 || num == 7) {
                    temNumeroPrimo = true;
                }
            }

            //Sem vogais
            if (i < senha.length() - 1) {
                char prox = senha.charAt(i + 1);
                if (vogais.indexOf(c) != -1 && c == prox) {
                    semVogais = false;
                    break;
                }
            }
        }

        //saida
        System.out.println("Sua senha: " + senha);
        System.out.println();

        if (temMaiusculo == true && temEspecial == true && temNumeroPrimo == true && semVogais == true) {
            System.out.println("\nSua senha esta valida!!!");
        } else {
            System.out.println("\nSua senha não esta valida!!!");
        }


    }
}
