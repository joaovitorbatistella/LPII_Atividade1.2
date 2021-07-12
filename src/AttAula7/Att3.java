package AttAula7;

import java.util.ArrayList;
import java.util.Scanner;

public class Att3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int option;
        boolean control = true;

        ArrayList<String> list = new ArrayList();

        System.out.println("Voce esta no menu, escolha uma das opcoes abaixo:");
        System.out.println("--> Opção 1 – Cadastrar");
        System.out.println("--> Opção 2 – Listar");
        System.out.println("--> Opção 3 – Remover");
        System.out.print("--> ");
        option = ler.nextInt();
        while(control == true) {
            if( option == 1 ){
                System.out.println("Voce escolheu cadastrar um usuario");
                System.out.print("Informe um nome curto para seu contato --> ");
                String contactName = ler.next();
                System.out.print("Informe um telefone para seu contato --> ");
                String contactTelphone = ler.next();
                String contact = contactName + ";" + contactTelphone;
                list.add(contact);
                System.out.println("Voce adicionou " + contactTelphone + " a seus contatos, que pertence a " + contactName + "!");
                System.out.println("\n");
            } else if( option == 2 ){
                System.out.println("Voce escolheu listar seus contatos, aqui estao eles: ");
                for(int i = 0; i < list.size(); i++){
                    String s = list.get(i);
                    String[] splited = s.split(";");
                    String newName = splited[0];
                    String newTelphone = splited[1];
                    System.out.println("(ID: " + i + ") --> " + newName + " - " + newTelphone);
                    System.out.println("\n");
                }
            } else if( option == 3 ){
                System.out.println("Voce escolheu deletar algum de seus contatos, aqui estao eles, basta digitar seu indice! Ex: (0)");
                for(int i = 0; i < list.size(); i++){
                    String s = list.get(i);
                    String[] splited = s.split(";");
                    String newName = splited[0];
                    String newTelphone = splited[1];
                    System.out.println("(ID: " + i + ") --> " + newName + " - " + newTelphone);
                }

                int id = ler.nextInt();
                list.remove(id);
                System.out.println("\n");
            } else {
                System.out.println("Voce digitou a opcao incorreta!");
                System.out.println("\n");
            }
            System.out.println("Sair? S|N");
            String hadleControl = ler.next();
            if(hadleControl.equals("N")){
                control = true;
                System.out.println("Voce esta no menu, escolha uma das opcoes abaixo:");
                System.out.println("--> Opção 1 – Cadastrar");
                System.out.println("--> Opção 2 – Listar");
                System.out.println("--> Opção 3 – Remover");
                option = ler.nextInt();
            } else {
                control = false;
            }
        }
        System.out.println("Bye");
    }
}
