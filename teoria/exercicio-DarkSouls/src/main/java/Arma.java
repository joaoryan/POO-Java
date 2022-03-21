public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    public Arma(String nome, int poder, int resistencia, String descricao) {
        this.nome = nome;
        this.poder = poder;
        this.resistencia = resistencia;
        this.descricao = descricao;
    }

    void mostrarInfo(){
        System.out.println("Nome arma: " + nome);
        System.out.println("Poder arma: " + poder);
        System.out.println("Resistencia arma: " + resistencia);
        System.out.println("Descricao arma: " + descricao);
    }
}
