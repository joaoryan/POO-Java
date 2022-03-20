public class Conta {
    private double saldo;
    int numero;

    Conta( double saldo, int numero){
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    private boolean checkMoney(double quantidade){
        if(quantidade <= saldo) return true;

        return false;
    }


    void saque (double saque){
        if(checkMoney(saque)){
            saldo -= saque;
            System.out.println("Saque realizado, seu saldo e de : R$" + saldo);
        }else {
            System.out.println("Vc e pobre");
        }
    }
}
