public class Kart {
    String nome;
    Motor motor;//composiçao
    Piloto piloto;

     public Kart(){
         motor = new Motor();
    }


    void pular(){
        System.out.println("Carro" + nome + "pulando");
    }
    void soltarTurbo(){
        System.out.println("Carro" + nome + " esta soltando turbo");
    }
    void fazerDrift(){
        System.out.println("Carro" + nome + " esta fazendo drift");
    }
}
