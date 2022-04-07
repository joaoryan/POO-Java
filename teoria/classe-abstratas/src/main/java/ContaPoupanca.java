public class ContaPoupanca extends Conta {

    @Override
    public void imprimeExtrato() {
        System.out.println("### Extrato da Conta ###");
        System.out.println("Saldo: "+this.getSaldo());
    }
}
