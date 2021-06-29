package AttAula6;

import java.util.*;

public class Att2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> names = new ArrayList();

        names.add("Joao Vitor");
        names.add("Tiago Rios");
        names.add("Ronaldo Serpa");
        names.add("Edimar Manica");
        names.add("Rogers de Pele");
        names.add("Roger Lavarda");
        names.add("Vanessa");
        names.add("Lucas Lammel");
        names.add("Tiago Ferreira");
        names.add("Andrenizia");

        System.out.println("Lista antes do uso de" +
                " Collection.sort() :\n" + names);

        Collections.sort(names);

        System.out.println("Lista apos uso de" +
                " Collection.sort() :\n" + names);
    }
}