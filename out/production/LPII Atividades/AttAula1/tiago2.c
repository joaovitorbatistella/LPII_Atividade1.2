#include <stdio.h>

int main (){
   int vetorA[9], vetorB[9], vetorC[9];


   for(int i=0; i<10; i++){
        printf("Insira um valor inteiro para o vetor A: ");
        scanf("%d", &vetorA[i]);
   }

   printf("\n");

   for(int j=0; j<10; j++){
        printf("Insira um valor inteiro para o vetor B: ");
        scanf("%d", &vetorB[j]);
   }

   for(int k=0; k<10; k++){
        vetorC[k] = vetorA[k] * vetorB[k];
   }

   printf("\n");

   for(int l=0; l<10; l++){
        printf("A multiplicacao do indice %d dos vetores A e B eh igual a: %d \n", l, vetorC[l]);
   }
}
