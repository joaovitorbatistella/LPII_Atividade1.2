package Atividade5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Att2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String a, regex = "((([A-Za-z]{3,9}:(?:\\/\\/)?)(?:[-;:&=\\+\\$,\\w]+@)?[A-Za-z0-9.-]+|(?:www.|[-;:&=\\+\\$,\\w]+@)[A-Za-z0-9.-]+)((?:\\/[\\+~%\\/.\\w-_]*)?\\??(?:[-\\+=&;%@.\\w_]*)#?(?:[\\w]*))?)";

        System.out.print("Escreva uma string para determinar se é um URL valido: ");
        a = ler.next();

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(a);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("URL");
        } else {
            System.out.println("Nao e URl");
        }

    }

}

