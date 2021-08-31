package ProvaFinal;

public class Mensagem {
    private String titulo;
    private String conteudo;

    public Mensagem(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String toString() {
        return "| Titulo: " + this.titulo + " | Conteudo: " + this.conteudo;
    }
}
