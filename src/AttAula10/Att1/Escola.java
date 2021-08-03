package AttAula10.Att1;

import java.util.ArrayList;

public class Escola {
    ArrayList<Pessoas> lista;

    Escola() {
        this.lista = new ArrayList<Pessoas>();
    }

    public void addPessoa(Pessoas p) {
        this.lista.add(p);
    };

    public void imprimir(){
        System.out.println("Aqui estao todas as pessoas da escola: ");
        for(Pessoas p : this.lista){
            System.out.println(p.nome);
        }
    }


}
