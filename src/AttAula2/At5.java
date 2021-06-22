package AttAula2;

import java.util.Scanner;


public class At5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetorResposta[] = new int[6], apostadorA[] = new int[6], apostadorB[] = new int[6], apostadorC[] = new int[6], apostadorD[] = new int[6], apostadorE[] = new int[6];
        int countA=0, countB=0, countC=0, countD=0, countE=0;
        int newVetA[] = new int[7], newVetB[] = new int[7], newVetC[] = new int[7], newVetD[] = new int[7], newVetE[] = new int[7];
        int resultadoApost[] = new int[6], biggestNumber=0, index=0;

        for(int i=0; i<6; i++){
            System.out.println("Insira um valor inteiro para o vetor resposta: ");
            vetorResposta[i] = ler.nextInt();
        }

        System.out.println("Vetor resposta: | ");
        for(int j=0; j<6; j++){
            System.out.println(vetorResposta[j] +" | ");
        }


        for(int k=0; k<6; k++){
            System.out.println("Apostador A, por favor preencha seu cartao: ");
            apostadorA[k] = ler.nextInt();
        }
        System.out.println("\n");
        for(int l=0; l<6; l++){
            System.out.println("Apostador B, por favor preencha seu cartao: ");
            apostadorB[l] = ler.nextInt();
        }
        System.out.println("\n");
        for(int m=0; m<6; m++){
            System.out.println("Apostador C, por favor preencha seu cartao: ");
            apostadorC[m] = ler.nextInt();
        }
        System.out.println("\n");
        for(int n=0; n<6; n++){
            System.out.println("Apostador D, por favor preencha seu cartao: ");
            apostadorD[n] = ler.nextInt();
        }
        System.out.println("\n");
        for(int o=0; o<6; o++){
            System.out.println("Apostador E, por favor preencha seu cartao: ");
            apostadorE[o] = ler.nextInt();
        }

        System.out.println("\n");

        for(int p=0; p<6; p++){
            for(int q=0; q<6; q++){
                if(apostadorA[p] == vetorResposta[q]){
                    countA++;
                    newVetA[countA] = apostadorA[p];
                }
            }
        }

        for(int r=0; r<6; r++){
            for(int s=0; s<6; s++){
                if(apostadorB[r] == vetorResposta[s]){
                    countB++;
                    newVetB[countB] = apostadorB[r];
                }
            }
        }

        for(int t=0; t<6; t++){
            for(int u=0; u<6; u++){
                if(apostadorC[t] == vetorResposta[u]){
                    countC++;
                    newVetC[countC] = apostadorC[t];
                }
            }
        }

        for(int v=0; v<6; v++){
            for(int w=0; w<6; w++){
                if(apostadorD[v] == vetorResposta[w]){
                    countD++;
                    newVetD[countD] = apostadorD[v];
                }
            }
        }

        for(int x=0; x<6; x++){
            for(int y=0; y<6; y++){
                if(apostadorE[x] == vetorResposta[y]){
                    countE++;
                    newVetE[countE] = apostadorE[x];
                }
            }
        }

        resultadoApost[0] = countA;
        resultadoApost[1] = countB;
        resultadoApost[2] = countC;
        resultadoApost[3] = countD;
        resultadoApost[4] = countE;

        for(int z=0; z<5; z++){
            if(resultadoApost[z] > biggestNumber) {
                biggestNumber = resultadoApost[z];
                index = z;
            }
        }

        if(biggestNumber == 0) {
            System.out.println("Nao houveram acertadores! \n \n");
        } else {
            int indexMoreOne = index+1;
            System.out.println("Atencao!!! Em caso de empate, o resultado sera por sorteio \n");
            System.out.println("O apostador "+ indexMoreOne +" obteve "+ resultadoApost[index] +" acertos!!! \n");
            System.out.println("Apostador "+ indexMoreOne +": Ganhador");
        }
    }
}
