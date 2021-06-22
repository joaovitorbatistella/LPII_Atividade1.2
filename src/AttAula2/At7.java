package AttAula2;

import java.util.Scanner;


public class At7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetorA[] = new int[10], number, positions[] = new int[10], count=0;


        for(int i=0; i<10; i++){
            System.out.println("Insira um valor inteiro para o vetor A: ");
            vetorA[i] = ler.nextInt();
        }

        System.out.println("Informe um valor que venha na mente: ");
        number = ler.nextInt();

        for(int j=0; j<10; j++){
            if(vetorA[j] == number){
                positions[count] = j;
                count++;
            }
        }

        if(count > 0){
            System.out.println("\n\nAs posicoes abaixo correspondem ao valor informado: ");
            System.out.println("| ");
            for(int k=0; k<count; k++){
                System.out.println(positions[k] + " |");
            }
        } else{
            System.out.println("O numero fornecido não existe no vetor!");
        }
    }
}
