import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        ArrayList<Inimigo> listaInimigos = new ArrayList<>();
        ArrayList<String> inimigoNome = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        for(int i = 1; i <= 6; i++) {
            System.out.print("Digite o nome do personagem " + i + ": ");
            String nome = teclado.nextLine();
            inimigoNome.add(nome);
        }

        CavaleiroNegro cavaleiro1 = new CavaleiroNegro(inimigoNome.get(0), random.nextDouble() * 100);
        Zumbi zumbi1 = new Zumbi(inimigoNome.get(1), random.nextDouble() * 100);
        Lambizome lambizome1 = new Lambizome(inimigoNome.get(2), random.nextDouble() * 100);
        CavaleiroNegro cavaleiro2 = new CavaleiroNegro(inimigoNome.get(3), random.nextDouble() * 100);
        Zumbi zumbi2 = new Zumbi(inimigoNome.get(4), random.nextDouble() * 100);
        Lambizome lambizome2 = new Lambizome(inimigoNome.get(5), random.nextDouble() * 100);

        listaInimigos.add(cavaleiro1);
        listaInimigos.add(zumbi1);
        listaInimigos.add(lambizome1);
        listaInimigos.add(cavaleiro2);
        listaInimigos.add(zumbi2);
        listaInimigos.add(lambizome2);

        System.out.println("Exibindo os inimigos antes de ordenar:");

        for(Inimigo inimigo : listaInimigos)
            System.out.println("Nome: " + inimigo.nome + " " + "Vida: " + inimigo.vida );

        Collections.sort(listaInimigos, Collections.reverseOrder());

        System.out.println("Exibindo os inimigos ordenados:");

        for(Inimigo inimigo : listaInimigos)
            System.out.println("Nome: " + inimigo.nome + " " + "Vida: " + inimigo.vida );
    }
}
