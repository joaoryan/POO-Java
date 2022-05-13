public class Lontra extends Mamifero implements Aquatico{
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void nadar() {
        System.out.println("Lontra nada nada nadaaaa");
    }
}
