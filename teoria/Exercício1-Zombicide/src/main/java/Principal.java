public class Principal {

    public static void main(String[] args) {
        int rodada1 = 130;
        int rodada2 = 240;
        int rodada3 = 320;

        double total;
        double media;
        total = rodada1 + rodada2 + rodada3;
        media = total / 3;
        System.out.println("O total de zumbis mortos é: ");
        System.out.println(total);
        System.out.println("A media de zumbis mortos é: ");
        System.out.println(media);
    }
}
