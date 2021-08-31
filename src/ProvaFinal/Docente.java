package ProvaFinal;

public class Docente extends Usuario {
    private String tipo;

    public Docente(String nome) {
        this.setNome(nome);
    }

    public void imprimirMensagem() {
        int lastIndex = this.getListaMensagensRecebidas().size() - 1;
        Mensagem message = this.getListaMensagensRecebidas().get(lastIndex);
        System.out.println("Docente: "+ this.getNome() + " " + message.toString());
    }
}
