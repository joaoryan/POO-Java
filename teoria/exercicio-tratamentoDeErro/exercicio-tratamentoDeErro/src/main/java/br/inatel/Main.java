import br.inatel.cdg.exception.NotaInsuficienteException;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Double> mapProject = new HashMap<String, Double>();

        //Inserindo no Set (HashMap)
        boolean decision = false;
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("*****************************************************");
            System.out.print("Informe o nome do projeto: ");
            String chave = entrada.nextLine();
            System.out.print("Informe a nota do projeto: ");
            Double valor = entrada.nextDouble();
            System.out.print("Deseja cadrastrar outro projeto true ou false: ");
            decision = entrada.nextBoolean();

            mapProject.put(chave, valor);
        } while (decision);

        //Buscando no HashMap

            mapProject.forEach((chave, valor) ->   {
                try {
                    if(valor >= 60) {
                        System.out.println("Projeto " + chave + " aprovado com nota de " + valor);
                    }else {
                          throw new NotaInsuficienteException("Projeto " + chave + " tem nota Insuficiente");
                    }
                    System.out.println("nome: " + chave);
                    System.out.println("Valor: " + valor);
                } catch (Exception e) {
                    System.out.println("Erro: " + e);
                }
            });


    }

}