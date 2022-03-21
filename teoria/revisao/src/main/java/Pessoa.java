public class Pessoa {

    private String nome;
        private int idade;

        Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }
        void mutacao(Pessoa pessoa){
            nome = pessoa.nome;
            idade = pessoa.idade;
        }

        public void falar(){
            System.out.println("Aluno: " + nome + " idade: " + idade);
        }

}
