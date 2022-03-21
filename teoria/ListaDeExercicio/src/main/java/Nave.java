/*
public class Nave {

    private String nome;
    private int vida;
    public Nave(String nome, int vida){
        this.nome = "Nave";
        this.vida = 70;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }
}
*/

public class Nave {
   public static int cont = 0;
   public int vida;
   private int numNaves;
  private String nome;
   public Nave(){
    this.vida = 100;
    cont++;
}
   public Nave(String nome){
             this.nome = nome;
             this.numNaves++;
   }
   public void mostraInfo(){
             System.out.println(vida);
   }
   public void trocaVida(Nave nave) {
             this.vida = nave.getVida();
            nave.setVida(this.vida);
   }

    public static int getCont() {
        return cont;
    }

    public int getVida() {
        return vida;
    }

    public int getNumNaves() {
        return numNaves;
    }

    public String getNome() {
        return nome;
    }

    public static void setCont(int cont) {
        Nave.cont = cont;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNumNaves(int numNaves) {
        this.numNaves = numNaves;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

