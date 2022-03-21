public class main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("jao", 20);
        Pessoa pessoa2 = new Pessoa("tigas", 90);
        Conta conta1 = new Conta();
        pessoa1.falar();
        pessoa2.falar();

        conta1.titular = pessoa1;
        System.out.println(conta1.titular.getNome());
    }
}
