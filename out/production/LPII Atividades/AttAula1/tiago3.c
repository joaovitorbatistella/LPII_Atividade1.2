#include <stdio.h>

int main (){
   int vetorA[9], smallerNumber, index=0;


   for(int i=0; i<10; i++){
        printf("Insira um valor inteiro para o vetor A: ");
        scanf("%d", &vetorA[i]);
   }

   smallerNumber = vetorA[0];

   for(int j=0; j<10; j++){
       if(vetorA[j] < smallerNumber) {
        smallerNumber = vetorA[j];
        index = j;
       }
   }

   printf("\n O menor numero do vetor eh o %d, que correponde ao indice %d:", smallerNumber, index);

}

