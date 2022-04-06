public class Main {
    public static void main(String[] args) {
        ZumbiLerdo zumbi1 = new ZumbiLerdo("Safado", 50, "espadão");
        CavaleiroNegro cavaleiro1 = new CavaleiroNegro("O top", 100, "8cm");
        CavaleiroDePrata cavaleiroDePrata1 = new CavaleiroDePrata("Jorge", 200, "arma boa 10cm");
        zumbi1.atacando();

        cavaleiro1.atacando();
        cavaleiro1.ataqueRapido();

        cavaleiroDePrata1.atacando();
        cavaleiroDePrata1.ataqueForte();
    }
}
