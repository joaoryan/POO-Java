public class ZumbiLerdo extends Inimigo{
    private String nome;
    private double vida;
    private String tipoArma;

    public ZumbiLerdo(String nome, double vida, String tipoArma) {
        super(nome, vida, tipoArma);
    }

    @Override
    public void atacando() {
        System.out.println("Zumbi lerdo atacando!");
    }
}
