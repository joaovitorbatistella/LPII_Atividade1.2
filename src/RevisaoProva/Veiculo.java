package RevisaoProva;

import java.util.ArrayList;

public class Veiculo {
    private int codigo;
    private int capacidade;
    private ArrayList<Passageiro> listaPassageirosNoOnibus = new ArrayList<>();
    private Linha linhaAtual;
    private int indiceParadaAtual;

    public void Veiculo() {
        this.indiceParadaAtual = 0;
    }

    public void setLinha(Linha linha) {
        this.linhaAtual = linha;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Parada proximaParada() {
        Parada paradaAtual = linhaAtual.getParada(this.indiceParadaAtual);
        this.indiceParadaAtual++;
        return paradaAtual;
    }

    public void adicionarAluno(Passageiro aluno) {
        this.listaPassageirosNoOnibus.add(aluno);
    }

    public void removerAluno() {
        for(int i=1; i < this.listaPassageirosNoOnibus.size(); i++){
            if(this.listaPassageirosNoOnibus.get(i).getDestino() == this.proximaParada()) {
                this.listaPassageirosNoOnibus.remove(i);
            }
        }

    }

    public void imprimirPassageiros() {
        for(int i=0; i < this.listaPassageirosNoOnibus.size(); i++){
            System.out.println(this.listaPassageirosNoOnibus.get(i).toString());
        }
    }

    public void fazerRota(){
        this.proximaParada();
        this.removerAluno();
        this.imprimirPassageiros();
    }

}
