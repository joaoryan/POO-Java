public class Produtos {
    String nome;
    String descricao;
    String fabricante;
    float preco;

    Produtos(String nome, String descricao, String fabricante, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    void ExibeCarrinho (Produtos produtos) {
        System.out.println("Nome : " + produtos.nome);
        System.out.println("Saldo: " + produtos.preco);
    }
}
