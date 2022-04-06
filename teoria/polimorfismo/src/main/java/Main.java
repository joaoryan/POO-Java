public class Main {
    public static void main(String[] args) {
        Inimigo zumbi1 = new ZumbiLerdo("Safado", 50, "espadão");
        Inimigo cavaleiro1 = new CavaleiroNegro("O top", 100, "8cm");
        Jogador jogador = new Jogador("Joao", 200);

        jogador.atacar(zumbi1);

        zumbi1.atacando();
        cavaleiro1.atacando();

        if(cavaleiro1 instanceof  CavaleiroNegro) {
            //Salva cavaleiro em uma variavel do tipo CavaleiroNegro
            CavaleiroNegro cav = (CavaleiroNegro) cavaleiro1;
            cav.ataqueRapido();
        }
    }
}
