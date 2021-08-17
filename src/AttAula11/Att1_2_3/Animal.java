package AttAula11.Att1_2_3;

public class Animal {
    String nome;
    int idade;
    String som;

    public Animal(String nome, int idade, String som){
        this.idade = idade;
        this.nome = nome;
        this.som = som;
    }

    public void emitirSom() {
        System.out.println("Som: " + this.som);
    }
}

