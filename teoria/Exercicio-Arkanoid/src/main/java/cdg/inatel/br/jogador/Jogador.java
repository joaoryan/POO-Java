package cdg.inatel.br.jogador;

import cdg.inatel.br.bloco.Bloco;

public class Jogador {

    private int ponto;

    public void destruirBloco(Bloco bloco){
        bloco.destruir();
        ponto++;
    }

    public int getPonto(){
        return this.ponto;
    }
}
