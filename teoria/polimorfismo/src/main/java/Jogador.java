public class Jogador {
    protected  String nome;
    protected  double vida;

    public Jogador(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(Inimigo inimigo){
        System.out.println("Atacando inimigo: " + inimigo.nome);
    }
}
