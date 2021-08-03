package AttAula10.Att1;

public class Alunos extends Pessoas{
    int matricula;

    public Alunos(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matricula: " + this.matricula);
    }
}
