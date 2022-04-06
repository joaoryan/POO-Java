public class Empresa {
    String nome;
    String cnpj;
    Departamento dep;

    public Empresa(String nome, String cnpj, String dep_nome, int dep_funcionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        dep = new Departamento(dep_nome, dep_funcionario);
    }

    void mostrarInfo(){
        System.out.println(dep.nome);
        System.out.println(dep.nFuncionario);
        System.out.println("-------------");
        System.out.println(nome);
        System.out.println(cnpj);
    }
}
