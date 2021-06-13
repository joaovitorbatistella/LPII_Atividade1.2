package AttAula3;

import java.util.Scanner;

public class Att1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int lenghtWord=0, count=0, countDigit=0;
        String word, wordInvert;

        System.out.println("Digite uma palavra: ");
        word = ler.next();

        lenghtWord = word.length();

        System.out.println("A palavra tem " + lenghtWord + " caracteres");

        System.out.println(word.toUpperCase());

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' ||
                    word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U'){
                count++;
            }
        }

        System.out.println("O número de vogais da frase é: " + count);

        if(word.startsWith("UNI") || word.startsWith("uni")) {
            System.out.println("A palavra começa com UNI");
        } else {
            System.out.println("A palavra não começa com UNI");
        }

        if(word.endsWith("RIO") || word.endsWith("rio")) {
            System.out.println("A palavra termina com RIO");
        } else {
            System.out.println("A palavra não termina com RIO");
        }

        for(int j=0; j<word.length(); j++){
            if(Character.isDigit(word.charAt(j))){
                countDigit++;
            }
        }

        System.out.println("A palavra contem " + countDigit + " digitos");

        wordInvert = new StringBuilder(word).reverse().toString();

        if(word.equals(wordInvert)) {
            System.out.println("A string é um palíndromo!");
        } else {
            System.out.println("A string não é um palíndromo!");
        }
    }
}
