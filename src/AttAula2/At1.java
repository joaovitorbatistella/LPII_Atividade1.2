package AttAula2;

import java.util.Scanner;

public class At1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetor[] = new int[20], count=0;

        for(int i=0; i<20; i++){
            System.out.println("Insira um valor inteiro: ");
            vetor[i] = ler.nextInt();
        }

        for(int j=0; j<20; j++){
            if(vetor[j] %2 == 0){
                count++;
            }
        }
        System.out.println("Esse vetor contem: " + count + " valores pares");
    }
}
