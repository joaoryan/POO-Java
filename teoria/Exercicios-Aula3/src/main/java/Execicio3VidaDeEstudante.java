import java.util.Scanner;

public class Execicio3VidaDeEstudante {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        System.out.println("Enter com a nota da primeira prova:");
        int nota1 = nota.nextInt();
        System.out.println("Enter com a nota da segunda prova:");
        int nota2 = nota.nextInt();

        int total = nota1 + nota2;
        double media = total /2;

        System.out.printf("Nota total " + total);
        System.out.println(" e a media " + media);

        if(media >= 60){
            System.out.println("O aluno foi aprovado");
        }else if(media >= 30){
            System.out.println("O aluno ficou de NP3");
            System.out.println("Enter com a nota da NP3:");
            int notaNP3 = nota.nextInt();
            int totalNP3 = total + notaNP3;
            double mediaNP3 = totalNP3 /2;

            if(mediaNP3 >= 50){
                System.out.println("O aluno foi aprovado");
            }else{
                System.out.println("O aluno foi reprovado");
            }
        }else{
            System.out.println("O aluno foi reprovado");
        }
    }
}
