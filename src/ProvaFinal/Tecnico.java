package ProvaFinal;

public class Tecnico extends Usuario {
    private String tipo;

    public Tecnico(String nome) {
        this.setNome(nome);
    }

    public void imprimirMensagem() {
        int lastIndex = this.getListaMensagensRecebidas().size() - 1;
        Mensagem message = this.getListaMensagensRecebidas().get(lastIndex);
        System.out.println("Visitante: "+ this.getNome() + " " + message.toString());
    }
}
