package ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Contas
        Conta cc = new ContaCC(82,"Genesis","Andre",50000);
        Conta cp = new ContaCP(42,"Silksong","Bernado",30000);
        Conta pj = new ContaPJ(22,"Pulhas","Deivao",92572.92);

        // Introduction
        System.out.println("Em qual conta você quer entrar? \n[1] corrente\n[2] Poupança\n[3] PJ");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                while (true) {
                    opcao = 0;
                    System.out.println("Oque você ira fazer?\n[1]sacar\n[2]depositar\n[3]ver saldo\n[4] tarifas");
                    opcao = input.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.print("Valor a ser sacado: :");
                            cc.sacar(input.nextDouble());
                            System.out.println("Saldo atual: " + cc.getSaldo());
                            break;
                            case 2:
                                System.out.print("Valor a ser depositado:");
                                cc.depositar(input.nextDouble());
                                System.out.println("Saldo atual: " + cc.getSaldo());
                                break;
                                case 3:
                                    System.out.println("Saldo atual: " + cc.getSaldo());
                                    break;
                                    case 4:
                                        System.out.println("Tarifa:"+cc.CalcularTarifaMensal());
                                        cc.CalcularTarifaMensal();
                                        break;
                    }
                }
            case 2:
                while (true) {
                    opcao = 0;
                    System.out.println("Oque você ira fazer?\n[1]sacar\n[2]depositar\n[3]ver saldo\n[4] tarifas");
                    opcao = input.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.print("Valor a ser sacado: :");
                            cp.sacar(input.nextDouble());
                            System.out.println("Saldo atual: " + cp.getSaldo());
                            break;
                        case 2:
                            System.out.print("Valor a ser depositado:");
                            cp.depositar(input.nextDouble());
                            System.out.println("Saldo atual: " + cp.getSaldo());
                            break;
                        case 3:
                            System.out.println("Saldo atual: " + cp.getSaldo());
                            break;
                        case 4:
                            System.out.println("Tarifa issento");
                            break;
                    }
                }
                case 3:
                    while (true) {
                        opcao = 0;
                        System.out.println("Oque você ira fazer?\n[1]sacar\n[2]depositar\n[3]ver saldo\n[4] tarifas");
                        opcao = input.nextInt();
                        switch (opcao) {
                            case 1:
                                System.out.print("Valor a ser sacado: :");
                                pj.sacar(input.nextDouble());
                                System.out.println("Saldo atual: " + pj.getSaldo());
                                break;
                            case 2:
                                System.out.print("Valor a ser depositado:");
                                pj.depositar(input.nextDouble());
                                System.out.println("Saldo atual: " + pj.getSaldo());
                                break;
                            case 3:
                                System.out.println("Saldo atual: " + pj.getSaldo());
                                break;
                            case 4:
                                System.out.println("Tarifa:"+pj.CalcularTarifaMensal());
                                pj.CalcularTarifaMensal();
                                break;
                        }

                    }
        }


    }
}
