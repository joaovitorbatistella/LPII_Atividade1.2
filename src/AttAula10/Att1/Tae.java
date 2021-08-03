package AttAula10.Att1;

public class Tae extends Pessoas{
    String projeto;

    public Tae(String nome, int idade, String projeto) {
        super(nome, idade);
        this.projeto = projeto;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Projeto: " + this.projeto);
    }
}
