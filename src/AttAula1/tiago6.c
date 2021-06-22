#include <stdio.h>

int main (){
    int vetorX[9], vetorY[9], vetorUni[19], vetorDif[19], vetorSoma[9], vetorProd[9], vetorInt[19];
    int countA=0, countB=0;

    for(int i=0; i<10; i++){
        printf("Insira um valor inteiro para o vetor X: ");
        scanf("%d", &vetorX[i]);
    }

    printf("\n\n");

    for(int j=0; j<10; j++){
        printf("Insira um valor inteiro para o vetor Y: ");
        scanf("%d", &vetorY[j]);
    }

    printf("\n\n");

    //Uniao de  x e y

    for(int v=0; v<10; v++){
        vetorUni[v] = vetorX[v];
    }

    for(int k=10; k<20; k++){
        vetorUni[k] = vetorY[k-10];
    }

    //Diferença de  x e y

    for(int l=0; l<10; l++){
        for(int m=0; m<10; m++){
            if(vetorX[l] != vetorY[m]){
                countA++;
                vetorDif[countA] = vetorX[l];
            }
        }
    }

    //Soma de  x e y

    for(int m=0; m<10; m++){
        vetorSoma[m] = vetorX[m] + vetorY[m];
   }

   // Produto de x e y

    for(int p=0; p<10; p++){
        vetorSoma[p] = vetorX[p] * vetorY[p];
   }

    //Interseção de  x e y

    for(int n=0; n<10; n++){
        for(int o=0; o<10; o++){
            if(vetorX[n] == vetorY[o]){
                countB++;
                vetorInt[countB] = vetorX[n];
            }
        }
    }

    printf("A uniao dos comjuntos X e Y eh igual: \n");
    printf("| ");
    for(int q=0; q<20; q++){
        printf("%d |", vetorUni[q]);
    }
    printf("\n\n");

    printf("A diferenca dos comjuntos X e Y eh igual: \n");
    printf("| ");
    for(int r=0; r<20; r++){
        printf("%d |", vetorDif[r]);
    }
    printf("\n\n");

    printf("A soma dos comjuntos X e Y eh igual: \n");
    printf("| ");
    for(int s=0; s<10; s++){
        printf("%d |", vetorSoma[s]);
    }
    printf("\n\n");

    printf("O produto dos comjuntos X e Y eh igual: \n");
    printf("| ");
    for(int t=0; t<10; t++){
        printf("%d |", vetorProd[t]);
    }
    printf("\n\n");

    printf("A intersecao dos comjuntos X e Y eh igual: \n");
    printf("| ");
    for(int u=0; u<20; u++){
        printf("%d |", vetorInt[u]);
    }
    printf("\n\n");
}
