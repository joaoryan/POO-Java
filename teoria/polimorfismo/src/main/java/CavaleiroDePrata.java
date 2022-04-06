public class CavaleiroDePrata extends Inimigo{

    public CavaleiroDePrata(String nome, double vida, String tipoArma) {
        super(nome, vida, tipoArma);
    }

    public void ataqueForte() {
        System.out.println("Bate com força!");
    }

    @Override
    public void atacando() {
        System.out.println("Cavaleiro de prata ataca vai");
    }
}
