package AttAula10.Att3;

import AttAula10.Att1.Pessoas;

import java.util.ArrayList;

public class ColecoesFormas {
    ArrayList<Forma> lista;

    ColecoesFormas() {
        this.lista = new ArrayList<Forma>();
    }

    public void addFormas(Forma forma) {
        this.lista.add(forma);
    }

    public void imprimir(){
        System.out.println("Aqui estao todas as formas: ");
        for(Forma f : this.lista){
            System.out.println(f);
        }
    }
}
