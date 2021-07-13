package AttAula8;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    String name;
    String department;
    double wage;
    Data created_at;
    String RG;

    void getRaise(double raise){
       wage += raise;
    }

    double calculateAnnualGain() {
        wage *= 12;
        return wage;
    }

    void show() {
        System.out.println("Nome: " + this.name);
        System.out.println("Departamento: " + this.department);
        System.out.println("Salario: " + this.wage);
        System.out.println("Data: " + this.created_at.formatedDate);
        System.out.println("RG: " + this.RG);
        System.out.println("Ganho anual: " + this.calculateAnnualGain());
    }
}

class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Data date = new Data();

        f1.name = "Hugo";
        f1.wage = 100;
        f1.department = "TI";
        f1.created_at = date;
        f1.RG = "000.000.000-1";
        f1.getRaise(50);


        Funcionario f2 = f1;

        f1.show();
        System.out.println("\n");
        f2.show();

        if(f1 == f2){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}

class Data {
    LocalDate now = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String formatedDate = now.format(formatter);
}