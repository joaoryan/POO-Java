import java.util.Random;
import java.util.Scanner;

public class Exercicio5Adivinhacao {
    public static void main(String[] args) {
        int numDigitado;
        int numberRandom;

        Random rand= new Random();
        Scanner num = new Scanner(System.in);

        do {
            numberRandom = rand.nextInt(10) + 1;

            System.out.println("Digite um numero e teste sua sorte:");
            numDigitado = num.nextInt();
        }while (numberRandom != numDigitado);

        System.out.println("Parabens você acertou, lembre-se sorte no jogo azar no amor ~(^_^)~");
    }
}
