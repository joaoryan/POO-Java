public class CavaleiroNegro extends Inimigo{

    public CavaleiroNegro(String nome, double vida, String tipoArma) {
        super(nome, vida, tipoArma);
    }

    public void ataqueRapido(){
        System.out.println("Ataque rapido!");
    }

    @Override
    public void atacando() {
        System.out.println("Cavaleiro negro bate");
    }
}
