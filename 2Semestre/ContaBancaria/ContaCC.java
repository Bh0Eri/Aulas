package ContaBancaria;

public class ContaCC extends Conta {

    public ContaCC(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depositado com sucesso!\n saldo: " + getSaldo());

    }

    @Override
    void sacar(double valor) {
        if(getSaldo() >= valor) {
            System.out.println("valor sacado: " + valor);
            setSaldo(getSaldo() - valor);
            System.out.println("Saldo atual: " + getSaldo());
        }else  {
            System.out.println("Saldo insuficiente!");
        }}

    @Override
    void exibirsaldo() {
        System.out.println("Seu saldo é:"+getSaldo());
    }

    @Override
    public double CalcularTarifaMensal(){
        return setSaldo(getSaldo()-12);
    }
}
