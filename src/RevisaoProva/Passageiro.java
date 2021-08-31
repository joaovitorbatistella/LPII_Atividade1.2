package RevisaoProva;

public class Passageiro {
    private String nome;
    private Parada origem;
    private Parada destino;

    public Passageiro(String nome, Parada origem, Parada destino) {
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
    }

    public String toString() {
        return "Aluno: " + this.nome + ", sobe: " + this.origem.getNome() + ", desce: " + this.destino.getNome();
    }

    public Parada getDestino() {
        return destino;
    }

}
