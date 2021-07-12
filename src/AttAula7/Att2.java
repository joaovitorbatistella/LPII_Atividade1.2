package AttAula7;

import java.util.ArrayList;
import java.util.Scanner;

public class Att2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList();

        int number;

        System.out.println("Informe 10 numeros inteiros positivos:");
        for(int i = 0; i < 10; i++) {
            System.out.print("    --> ");
            number = ler.nextInt();
            list.add(number);
        }

        System.out.println("\n Lista completa:");
        for(Integer l : list) {
            System.out.println("Elemento: " + l);
        }

        for(int j = 0; j < list.size(); j++) {
            if(list.get(j) %2 == 0) {
                list.remove(j);
            }
        }

        System.out.println("\n Lista apos exclusao de numeros positivos:");
        for(Integer k : list) {
            System.out.println("Elemento: " + k);
        }

    }
}
