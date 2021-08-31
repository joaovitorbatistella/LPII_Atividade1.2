package ProvaFinal;

public class Visitante extends Usuario {
    private String tipo;

    public Visitante(String nome) {
        super(nome);
    }

    public void imprimirMensagem() {
        int lastIndex = this.getListaMensagensRecebidas().size() - 1;
        Mensagem message = this.getListaMensagensRecebidas().get(lastIndex);
        System.out.println("Visitante: "+ this.getNome() + " " + message.toString());
    }
}
