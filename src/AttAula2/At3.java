package AttAula2;

import java.util.Scanner;


public class At3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetorA[] = new int[10], smallerNumber, index=0;


        for(int i=0; i<10; i++){
            System.out.println("Insira um valor inteiro para o vetor A: ");
            vetorA[i] = ler.nextInt();
        }

        smallerNumber = vetorA[0];

        for(int j=0; j<10; j++){
            if(vetorA[j] < smallerNumber) {
                smallerNumber = vetorA[j];
                index = j;
            }
        }

        System.out.println("O menor numero do vetor eh o "+smallerNumber+", que correponde ao indice:" + index);
    }
}
