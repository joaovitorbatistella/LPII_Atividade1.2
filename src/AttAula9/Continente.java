package AttAula9;

import java.util.ArrayList;

public class Continente {
    private String nome;
    public ArrayList<Pais> paises = new ArrayList<Pais>();

    public void setName(String name)
    {
        this.nome = name;
    }

    public void addCountries(Pais pais)
    {
        this.paises.add(pais);
    }

    public void getDimensaoContinente(Pais pais) {
        Double dim = pais.getDimensao();
    }

    public void getPopulacaoContinente(Pais pais) {
        Integer pop = pais.getPop();
    }
}
