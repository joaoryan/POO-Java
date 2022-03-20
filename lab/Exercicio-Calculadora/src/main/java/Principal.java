import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        float num1;
        float num2;
        char operador;

        Scanner valorDigitado = new Scanner(System.in);

        System.out.println("Enter com o primeiro numero");
        num1 = valorDigitado.nextInt();

        System.out.println("Enter com o operador");
        operador = (char)System.in.read();

        System.out.println("Enter com o segundo numero");
        num2 = valorDigitado.nextInt();

        if(operador == '+') {
            System.out.println("O resultado é: "+ (num1 + num2));
        }else if(operador == '-') {
            System.out.println("O resultado é: "+ (num1 - num2));
        }else if(operador == '/') {
            System.out.println("O resultado é: "+ (num1 / num2));
        }else if(operador == '*') {
            System.out.println("O resultado é: "+ (num1 * num2));
        }else {
            System.out.println("O imposivel de realizar a conta");
        }

    }
}
