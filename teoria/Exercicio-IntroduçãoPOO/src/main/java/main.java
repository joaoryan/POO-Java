public class main {

    public static void main(String[] args) {

        Conta conta = new Conta(100,3);

        System.out.println(conta.getSaldo());

        conta.saque(22);

        conta.saque(200);
    }
}
