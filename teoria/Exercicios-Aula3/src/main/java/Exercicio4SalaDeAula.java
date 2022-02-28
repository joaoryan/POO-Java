import java.util.Scanner;

public class Exercicio4SalaDeAula {

    public static void main(String[] args) {

        Scanner numAluno = new Scanner(System.in);

        System.out.println("Enter com a quantidade de alunos matriculados em C125:");
        int quantAluno = numAluno.nextInt();

        switch (quantAluno) {
            case 10:
                System.out.println("A sala utilizada é I-15");
                break;
            case 20:
                System.out.println("A sala utilizada é I-15");
                break;
            case 30:
                System.out.println("A sala utilizada é I-22");
                break;
            default:
                System.out.println("Nenhuma sala para esse numero de alunos");
        }
    }
}
