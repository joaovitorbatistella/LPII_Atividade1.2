import java.util.Scanner;


public class At4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetorA[] =new int[20], vetorNew[] = new int[20];


        for(int i=0; i<20; i++){
            System.out.println("Insira um valor inteiro para o vetor A: ");
            vetorA[i] = ler.nextInt();
        }

        System.out.println("O vetor antigo corresponde a: \n");

        for(int j=0; j<20; j++){
            System.out.println(vetorA[j] + " | ");
        }

        for(int k=0; k<20; k++){
            vetorNew[k] = vetorA[19-k];
        }

        System.out.println("O novo vetor corresponde a: \n");
        System.out.println("| ");

        for(int l=0; l<20; l++){
            System.out.println(vetorNew[l] +" | ");
        }
    }
}
