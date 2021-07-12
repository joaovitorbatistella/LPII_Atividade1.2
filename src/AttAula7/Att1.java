package AttAula7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Att1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList();

        int number;

        System.out.println("Informe numeros inteiros positivos, quando quiser parar, digite um numero negativo: ");
        System.out.print("    --> ");
        number = ler.nextInt();
        while(number >= 0) {
            list.add(number);
            System.out.print("    --> ");
            number = ler.nextInt();
        }

        System.out.println("\n Usando um For tradicional");
        for(int i = 0; i < list.size(); i++) {
            int pos = list.get(i);
            System.out.println("Elemento " + pos);
        }

        System.out.println("\n Usando um For dinamico para percorrer Arrays");
        for (Integer j : list) {
            System.out.println("Elemento " + j);
        }

        System.out.println("\n Usando um Iteradores do Java");
        Iterator it = list.iterator();

        while(it.hasNext()){
            Integer k = (Integer) it.next();

            System.out.println("Elemento " + k);
        }
    }
}






