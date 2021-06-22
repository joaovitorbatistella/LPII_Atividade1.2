#include <stdio.h>

int main (){
   int vetorA[14];

    for (int k=0; k < 15; k++) {
        printf("Informe um numero inteiro para o vetor: ");
        scanf("%d", &vetorA[k]);
    }

    for (int i=0; i<15; i++) {
        for (int j=i; j<15; j++) {
            if (vetorA[i] < vetorA[j]) {
                int temp = vetorA[i];
                vetorA[i] = vetorA[j];
                vetorA[j] = temp;
            }
        }
    }

    printf("\n|");
    for (int l=0; l < 15; l++) {
        printf("% d |", vetorA[l]);
    }
}
