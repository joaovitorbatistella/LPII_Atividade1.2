package AttAula11.Att1_2_3;

public class Preguica extends Animal {
    String acao;

    public Preguica(String nome, int idade, String som, String acao){
        super(nome, idade, som);
        this.acao = acao;
    }

    public void subirEmArvore() {
        System.out.println("Acao: " + acao);
    }

}
