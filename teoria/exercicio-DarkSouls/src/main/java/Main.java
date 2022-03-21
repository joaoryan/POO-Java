public class Main {
    public static void main(String[] args) {
        Ashen personagem = new Ashen("Robertinho", 15);
        Arma arma1 = new Arma("espada", 20, 30, "Do caralho");

        personagem.arma = arma1;

        personagem.arma.mostrarInfo();
        System.out.println("------------------");
        personagem.mostrarInfo();

        personagem.tomarDano();
        personagem.tomarDano();
        personagem.usarArma();
        personagem.usarArma();
        personagem.usarArma();
        personagem.usarArma();

        System.out.println("------------------");
        personagem.arma.mostrarInfo();
        System.out.println("------------------");
        personagem.mostrarInfo();

    }
}
