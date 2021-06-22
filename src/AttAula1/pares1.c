#include <stdio.h>

int main (){
   int vetor[19], count=0;


   for(int i=0; i<20; i++){
        printf("Insira um valor inteiro: \n");
        scanf("%d", &vetor[i]);
   }

   for(int j=0; j<20; j++){
        if(vetor[j] %2 == 0){
            count++;
        }
   }

   printf("Esse vetor contem: %d valores pares", count);
}
