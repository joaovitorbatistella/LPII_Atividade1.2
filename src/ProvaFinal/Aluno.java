package ProvaFinal;

public class Aluno extends Usuario {
    private String tipo;

    public Aluno(String nome) {
        this.setNome(nome);
    }

    public void imprimirMensagem() {
        int lastIndex = this.getListaMensagensRecebidas().size() - 1;
        Mensagem message = this.getListaMensagensRecebidas().get(lastIndex);
        System.out.println("Aluno: "+ this.getNome() + " " + message.toString());
    }
}
