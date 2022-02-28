import java.util.Scanner;

public class Exercicio2Zombicide2 {
    public static void main(String[] args) {
        Scanner numZumbi = new Scanner(System.in);

        System.out.println("Enter com a quantidade de zumbi derrotados da primeira rodada:");
        int numZumbi1 = numZumbi.nextInt();
        System.out.println("Enter com a quantidade de zumbi derrotados da segunda rodada:");
        int numZumbi2 = numZumbi.nextInt();
        System.out.println("Enter com a quantidade de zumbi derrotados da terceira rodada:");
        int numZumbi3 = numZumbi.nextInt();

        int total = numZumbi1 + numZumbi2 + numZumbi3;

        System.out.println("Zumbis derrotados 1° rodada: " + numZumbi1);
        System.out.println("Zumbis derrotados 2° rodada: " + numZumbi2);
        System.out.println("Zumbis derrotados 3° rodada: " + numZumbi3);

        System.out.printf("O total de zumbis é " + total);
        System.out.printf(" e a media de zumbis mortos nas tres rodadas é " + total / 3);
    }
}
