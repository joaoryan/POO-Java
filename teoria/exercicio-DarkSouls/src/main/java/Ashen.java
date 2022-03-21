public class Ashen {
    String nome;
    int vida;
    Arma arma;

    public Ashen(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }

    void usarArma(){
        arma.resistencia -= 2;
    }

    void tomarDano(){
        vida -= 5;
    }
}
