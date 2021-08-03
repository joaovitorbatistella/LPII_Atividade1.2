package AttAula10.Att1;

public class Docentes extends Pessoas{
    int matricula_docente;
    String disciplina;

    public Docentes(String nome, int idade, int matricula_docente, String disciplina) {
        super(nome, idade);
        this.matricula_docente = matricula_docente;
        this.disciplina = disciplina;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matricula: " + this.matricula_docente);
        System.out.println("Disiciplina: " + this.disciplina);
    }
}
