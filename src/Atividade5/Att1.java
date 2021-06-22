package Atividade5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Att1 {
        public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);

        String a, regexCell = "/\\([1-9]\\d\\)\\s9?\\d{4}-\\d{4}/gm",  regexFix = "/\\([1-9]\\d\\)\\s9?\\d{3}-\\d{4}/gm";
        System.out.print("Escreva uma string para determinar se é um telefone fixo ou celular: ");
        a = ler.next();

        Pattern patternCell = Pattern.compile(regexCell, Pattern.CASE_INSENSITIVE);
        Matcher matcherCell = patternCell.matcher(a);
        boolean matchFoundCell = matcherCell.find();

        Pattern patternFix = Pattern.compile(regexFix, Pattern.CASE_INSENSITIVE);
        Matcher matcherFix = patternFix.matcher(a);
        boolean matchFoundFix = matcherFix.find();
        if(matchFoundCell) {
            System.out.println("Celular");
        } else if(matchFoundFix) {
            System.out.println("Fixo");
        } else {
            System.out.println("Padrao nao encontrado");
        }
    }
}
