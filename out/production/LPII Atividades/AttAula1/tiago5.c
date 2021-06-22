#include <stdio.h>

int main (){
    int vetorResposta[5], apostadorA[5], apostadorB[5], apostadorC[5], apostadorD[5], apostadorE[5];
    int countA=0, countB=0, countC=0, countD=0, countE=0;
    int newVetA[5], newVetB[5], newVetC[5], newVetD[5], newVetE[5];
    int resultadoApost[5], biggestNumber, index=0;

    for(int i=0; i<6; i++){
        printf("Insira um valor inteiro para o vetor resposta: ");
        scanf("%d", &vetorResposta[i]);
    }

    printf("\nVetor resposta: | ");
    for(int j=0; j<6; j++){
        printf("%d | ", vetorResposta[j]);
    }

    printf("\n \n");

    for(int k=0; k<6; k++){
        printf("Apostador A, por favor preencha seu cartao: ");
        scanf("%d", &apostadorA[k]);
    }
    printf("\n");
    for(int l=0; l<6; l++){
        printf("Apostador B, por favor preencha seu cartao: ");
        scanf("%d", &apostadorB[l]);
    }
    printf("\n");
    for(int m=0; m<6; m++){
        printf("Apostador C, por favor preencha seu cartao: ");
        scanf("%d", &apostadorC[m]);
    }
    printf("\n");
    for(int n=0; n<6; n++){
        printf("Apostador D, por favor preencha seu cartao: ");
        scanf("%d", &apostadorD[n]);
    }
    printf("\n");
    for(int o=0; o<6; o++){
        printf("Apostador E, por favor preencha seu cartao: ");
        scanf("%d", &apostadorE[o]);
    }

    printf("\n");

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
        printf("Nao houveram acertadores! \n \n");
   } else {
        printf("Atencao!!! Em caso de empate, o resultado sera por sorteio \n \n");
        printf("O apostador %d obteve %d acertos!!! \n \n", index+1, resultadoApost[index]);
        printf("Apostador %d: Ganhador", index+1);
   }


}
