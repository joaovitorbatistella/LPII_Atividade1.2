package AttAula10.Att2;

public class Secretaria extends Funcionario {
    private int ramal;

    public void mostrarDadosS(){
        System.out.println("\n Dados Secretaria");
        this.mostrarDados();
        System.out.println("Ramal: " + getRamal());
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
