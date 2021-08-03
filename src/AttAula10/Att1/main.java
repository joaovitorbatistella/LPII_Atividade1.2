package AttAula10.Att1;

public class main {
    public static void main(String[] args) {
        Alunos pessoa1 = new Alunos("João Vítor Batistella", 19, 2020003774);
        Docentes pessoa2 = new Docentes("Tiago Rios da Rocha", 35, 202000000, "Algoritmos e Programação");
        Tae pessoa3 = new Tae("Edimar Manica", 35, "Aplicação do Moodle");

        pessoa1.imprimir();
        pessoa2.imprimir();
        pessoa3.imprimir();

        Escola e = new Escola();
        e.addPessoa(pessoa1);
        e.addPessoa(pessoa2);
        e.addPessoa(pessoa3);
        e.imprimir();
    }
}
