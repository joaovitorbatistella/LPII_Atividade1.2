package AttAula6;

import java.util.ArrayList;
import java.util.Scanner;

public class Att1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> names = new ArrayList();

        names.add("Joao Vitor");
        names.add("Tiago Rios");

        System.out.printf("\nInforme um nome para adicionar na lista:\n");
        String addName = ler.nextLine();

        if (!names.contains(addName)){
            names.add(addName);
            int position = names.indexOf(addName);
            System.out.println(addName + " foi adicionado na posicao " + position);
        } else {
            System.out.println("Este nome ja esta contido na lista!");
        }

        while(addName.length()!=0) {
            if (!names.contains(addName)){
                names.add(addName);
                int position = names.indexOf(addName);
                System.out.println(addName + " foi adicionado na posicao " + position);
            } else {
                System.out.println("Este nome ja esta contido na lista!");
            }

            System.out.printf("\nInforme um nome para adicionar na lista ou \"exit\" para encerrar a insersao:\n");
            addName = ler.nextLine();
            System.out.println(addName);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ") " + names.get(i));
        }
    }
}






