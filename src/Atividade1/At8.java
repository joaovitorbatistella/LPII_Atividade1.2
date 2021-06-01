package Atividade1;

import java.util.Scanner;

public class At8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetorA[] = new int[15];

        for (int k=0; k < 15; k++) {
            System.out.println("Informe um numero inteiro para o vetor: ");
            vetorA[k] = ler.nextInt();
        }

        for (int i=0; i<15; i++) {
            for (int j=i; j<15; j++) {
                if (vetorA[i] < vetorA[j]) {
                    int temp = vetorA[i];
                    vetorA[i] = vetorA[j];
                    vetorA[j] = temp;
                }
            }
        }

        System.out.println(" ");
        for (int l=0; l < 15; l++) {
            System.out.println(vetorA[l] + " |");
        }
    }
}
