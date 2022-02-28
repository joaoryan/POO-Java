import java.util.Random;
import java.util.Scanner;

public class Exercicio6AdivinhacaoAprimorado {
    public static void main(String[] args) {
        int numDigitado;
        int numberRandom;

        Random rand= new Random();
        Scanner num = new Scanner(System.in);

        do {
            numberRandom = rand.nextInt(10) + 1;

            System.out.println("Digite um numero e teste sua sorte:");
            numDigitado = num.nextInt();
            if(numDigitado < numberRandom){
                System.out.println("Numero digitado é menor que o numero gerado pelo computador");
            }else if(numDigitado > numberRandom){
                System.out.println("Numero digitado é maior que o numero gerado pelo computador");
            }
        }while (numberRandom != numDigitado);

        System.out.println("Parabens você acertou, lembre-se sorte no jogo azar no amor ~(^_^)~");
    }
}
