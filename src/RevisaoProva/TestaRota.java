package RevisaoProva;

public class TestaRota {
    public static void main(String[] args) {
        Parada parada1 = new Parada("caixa dagua", "rua da caixa daqua");
        Parada parada2 = new Parada("TK", "rua da tk");
        Parada parada3 = new Parada("Território", "rua da Território");

        Passageiro aluno1 = new Passageiro("Maria", parada1, parada1);
        Passageiro aluno2 = new Passageiro("Eduardo", parada2, parada2);
        Passageiro aluno3 = new Passageiro("Fernando", parada1, parada2);
        Passageiro aluno4 = new Passageiro("Juliana", parada3, parada3);
        Passageiro aluno5 = new Passageiro("Juliana", parada3, parada3);

        Linha linha1 = new Linha();
        linha1.setNome("centro");

        Van girus = new Van();

        linha1.setListaDeParada(parada1);
        linha1.setListaDeParada(parada2);
        linha1.setListaDeParada(parada3);

        girus.setLinha(linha1);

        girus.adicionarAluno(aluno1);
        girus.adicionarAluno(aluno2);
        girus.adicionarAluno(aluno3);
        girus.adicionarAluno(aluno4);
        girus.adicionarAluno(aluno5);

        girus.fazerRota();
    }
}
