public abstract class Inimigo implements Comparable<Inimigo> {

    public String nome;
    public double vida;

    public Inimigo(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    @Override
    public int compareTo(Inimigo o) {
        if(this.vida < o.vida)
            return -1;

        if(this.vida > o.vida)
            return 1;

        return 0;
    }

}
