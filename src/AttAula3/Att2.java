package AttAula3;

import java.util.Scanner;

public class Att2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String number;

        System.out.print("Digite um número: ");
        number = ler.next();

        for(int i=0; i<number.length(); i++){
            if(number.charAt(i) == '0') {
                System.out.print("Zero ");
            } else if(number.charAt(i) == '1') {
                System.out.print("Um ");
            } else if(number.charAt(i) == '2') {
                System.out.print("Dois ");
            } else if(number.charAt(i) == '3') {
                System.out.print("Três ");
            } else if(number.charAt(i) == '4') {
                System.out.print("Quatro ");
            } else if(number.charAt(i) == '5') {
                System.out.print("Cinco ");
            } else if(number.charAt(i) == '6') {
                System.out.print("Seis ");
            } else if(number.charAt(i) == '7') {
                System.out.print("Sete ");
            } else if(number.charAt(i) == '8') {
                System.out.print("Oito ");
            } else if(number.charAt(i) == '9') {
                System.out.print("Nove ");
            }
        }
    }
}
