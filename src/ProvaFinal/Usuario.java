package ProvaFinal;

import java.util.ArrayList;

public abstract class Usuario {
    private String nome;
    private ArrayList<Mensagem> listaMensagensRecebidas = new ArrayList();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public ArrayList<Mensagem> getListaMensagensRecebidas() {
        return this.listaMensagensRecebidas;
    }

    public void receberMensagem(Mensagem msg) {
        this.cadastrarMensagem(msg);
        this.imprimirMensagem();
    }

    public void cadastrarMensagem(Mensagem msg) {
        this.listaMensagensRecebidas.add(msg);
    }

    public void imprimirMensagem() {}
}
