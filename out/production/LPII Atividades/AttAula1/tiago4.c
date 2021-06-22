#include <stdio.h>

int main (){
   int vetorA[19], vetorNew[19];


   for(int i=0; i<20; i++){
        printf("Insira um valor inteiro para o vetor A: ");
        scanf("%d", &vetorA[i]);
   }

    printf("\n");
    printf("O vetor antigo corresponde a: \n");
    printf("| ");

    for(int j=0; j<20; j++){
        printf("%d | ", vetorA[j]);
   }

   printf("\n");
   printf("\n");

   for(int k=0; k<20; k++){
        vetorNew[k] = vetorA[19-k];
   }

    printf("O novo vetor corresponde a: \n");
    printf("| ");

   for(int l=0; l<20; l++){
        printf("%d | ", vetorNew[l]);
   }
}
