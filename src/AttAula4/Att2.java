package AttAula4;

public class Att2 {
    public static void main(String[] args){

        String frase = "Socorram-me, subi no ônibus em Marrocos", fraseTemp[];;

        fraseTemp = frase.split(" ");

        StringBuilder fraseInvertida = new StringBuilder();

        fraseInvertida.append(fraseTemp[5] + " ").append(fraseTemp[4] + " ").append(fraseTemp[3] + " ").append(fraseTemp[2] + " ").append(fraseTemp[0] + " ");

        System.out.println(fraseInvertida.toString());
    }
}
