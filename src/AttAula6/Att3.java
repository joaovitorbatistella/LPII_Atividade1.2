package AttAula6;

import java.util.ArrayList;
import java.util.Scanner;

public class Att3 {
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

        System.out.println("Qual nome voce quer remover da lista?");
        String removeName = ler.next();

        if (removeName.equals("clear")) {
            names.clear();
            System.out.println("A lista foi limpa!");
        } else if (names.indexOf(removeName) != -1) {
            names.remove(names.indexOf(removeName));
            System.out.println("O nome " + removeName + " foi removido com sucesso!");
        } else {
            System.out.println("Nome nao encontrado na lista");
        }

        while(removeName.equals("exit") == false) {
            if (removeName.equals("clear") == true) {
                names.clear();
                System.out.println("A lista foi limpa!");
            } else if (names.indexOf(removeName) != -1) {
                names.remove(names.indexOf(removeName));
                System.out.println("O nome " + removeName + " foi removido com sucesso!");
            } else {
                System.out.println("Nome nao encontrado na lista");
            }

            System.out.println("Qual nome voce quer remover da lista?");
            ler.next();
        }

        System.out.println("Ate logo!");
    }
}