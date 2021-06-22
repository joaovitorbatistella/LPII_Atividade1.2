#include <stdio.h>

int main (){
   int vetorA[9], number, positions[9], count=0;


   for(int i=0; i<10; i++){
        printf("Insira um valor inteiro para o vetor A: ");
        scanf("%d", &vetorA[i]);
   }

    printf("\nInforme um valor que venha na mente: ");
    scanf("%d", &number);

   for(int j=0; j<10; j++){
        if(vetorA[j] == number){
            positions[count] = j;
            count++;
        }
    }

    if(count > 0){
        printf("\n\nAs posicoes abaixo correspondem ao valor informado: ");
        printf("| ");
        for(int k=0; k<count; k++){
            printf("%d |", positions[k]);
        }
    } else{
        printf("\n\nO numero fornecido não existe no vetor!");
    }
}
