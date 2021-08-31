package RevisaoProva;

import java.util.ArrayList;

public class Linha {
    private String nome;
    private ArrayList<Parada> listaDeParada = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Parada> getListaDeParada() {
        return listaDeParada;
    }

    public void setListaDeParada(Parada parada) {
        this.listaDeParada.add(parada);
    }

    public Parada getParada(int x) {
        return  this.listaDeParada.get(x);
    }

}
