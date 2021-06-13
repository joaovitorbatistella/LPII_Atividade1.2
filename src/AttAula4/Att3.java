package AttAula4;

import java.util.Scanner;

public class Att3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        StringBuilder fraseP = new StringBuilder();

        fraseP.append("pUpm pfpiplpmpe plpepgpapl");

        for(int i=0; i<fraseP.length(); i++){
            if(fraseP.charAt(i) == 'p'){
                fraseP.delete(i, i+1);
            }
        }

        System.out.println(fraseP);
    }
}
