public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Nubank", "1234");
        Cliente[] clientes = new Cliente[3];
        Cliente clientes1 = new Cliente("joao");
        Cliente clientes2 = new Cliente("ryan");
        Cliente clientes3 = new Cliente("naruto");

       clientes[0] = clientes1;
       clientes[1] = clientes2;
       clientes[2] = clientes3;

        banco1.mostrarInfo();
        clientes[0].mostrarInfo();
    }
}
