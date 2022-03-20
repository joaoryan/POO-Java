public class Principal {
    public static void main(String[] args) {
        Produtos[] produtos = new Produtos[4];

        produtos[0] = new Produtos("bolacha","recheada", "top", 3);
        produtos[1] = new Produtos("biscoito","polvilho", "top de mais", 8);

        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null) {
                produtos[i].ExibeCarrinho(produtos[i]);
            }
        }
    }
}
