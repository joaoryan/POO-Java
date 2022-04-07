public class Banco {
    String nome;
    String cnpj;
    Cliente clientes[];

    public Banco(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    void mostrarInfo(){
        System.out.println("Banco: " + nome);

    }
}
