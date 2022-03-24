package cdg.inatel.br.bloco;

public class Bloco {

    public static int numBloco = 0;

    public Bloco(){
        numBloco++;
    }

    public void destruir() {
        numBloco--;
    }
}
