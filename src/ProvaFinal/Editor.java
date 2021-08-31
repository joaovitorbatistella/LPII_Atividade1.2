package ProvaFinal;

import java.util.ArrayList;

public class Editor {
    private String nome;
    private ArrayList<Usuario> listaSeguidres = new ArrayList();

    public Editor(String nome) {
        this.nome = nome;
    }

    public void cadastrarSeguidor(Usuario usr) {
        this.listaSeguidres.add(usr);
    }

    public void enviarMensagem(Mensagem msg) {
        for(int i=0; i < this.listaSeguidres.size(); i++) {
            this.listaSeguidres.get(i).receberMensagem(msg);
        }
    }

}
