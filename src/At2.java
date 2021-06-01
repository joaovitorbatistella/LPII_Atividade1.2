import java.util.Scanner;

public class At2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int vetorA[] = new int[10], vetorB[] = new int[10], vetorC[] = new int[10];


        for(int i=0; i<10; i++){
            System.out.println("Insira um valor inteiro para o vetor A: ");
            vetorA[i] = ler.nextInt();
        }

        System.out.println("\n");

        for(int j=0; j<10; j++){
            System.out.println("Insira um valor inteiro para o vetor B: ");
            vetorB[j] = ler.nextInt();
        }

        for(int k=0; k<10; k++){
            vetorC[k] = vetorA[k] * vetorB[k];
        }

        for(int l=0; l<10; l++){
            System.out.println("A multiplicacao do indice "+ l +" dos vetores A e B eh igual a:" + vetorC[l]);
        }
    }
}
