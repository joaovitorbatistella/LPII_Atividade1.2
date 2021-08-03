package AttAula10.Att2;

public class Telefonista extends Funcionario{
    private int estacaoDeTrabalho;

    public void mostrarDadosT(){
        System.out.println("\n Dados Telefonista");
        this.mostrarDados();
        System.out.println("Estacao de Trablho: " + getEstacaoDeTrabalho());
    }

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }
}
