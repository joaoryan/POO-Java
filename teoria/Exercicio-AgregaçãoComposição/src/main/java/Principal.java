public class Principal {

    public static void main(String[] args) {

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "Carlos Nazare";
        kart2.nome = "kart2";

        // composilção vc so pode acessar o motor pelo kart
        kart1.motor.velocidadeMaxima = 120.0f;
        kart1.motor.cilindradas = "200";

        kart2.motor.velocidadeMaxima = 100.0f;
        kart2.motor.cilindradas = "260";

        Piloto piloto1 = new Piloto("joao", false);
        Piloto piloto2 = new Piloto("ryan", true);

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart1.fazerDrift();
        kart1.soltarTurbo();
        kart1.pular();

        kart2.fazerDrift();
        kart2.soltarTurbo();
        kart2.pular();

        kart1.motor.mostraInfo();
        kart2.motor.mostraInfo();

    }
}
