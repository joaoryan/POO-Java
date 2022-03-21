import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banda extends Membro{
    public String nome;
    public String genero;

    ArrayList<Membro> arrayMembro = new ArrayList();
    List<Musica> arrayMusica = new ArrayList<Musica>();

   public void addMembro(String nome, String funcao){
       arrayMembro.add(new Membro("joao",  "top"));
   }

    public void addMusica(String nome, double duracao){
        arrayMusica.add(new Musica(nome,duracao));
    }

   public void mostra(){
       Object ArrayList;
        System.out.println(arrayMusica.get(0));
    }

    public Banda(String nome, String genero) {
        super(nome, genero);
        this.nome = nome;
        this.genero = genero;
    }
}
