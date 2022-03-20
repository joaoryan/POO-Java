public class Motor {
    String cilindradas;
    float velocidadeMaxima;

    /*
    Motor(String cilindradas, float velocidade){
        this.cilindradas =cilindradas;
        this.velocidadeMaxima = velocidade;
    }
    */

    void mostraInfo(){
        System.out.println("cilindradas: " + cilindradas);
        System.out.println("velocidade: " + velocidadeMaxima);
    }
}
