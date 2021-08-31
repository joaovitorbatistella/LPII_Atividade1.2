package ProvaFinal;

public class Principal {
    public static void main(String[] args) {
        Editor editor1 = new Editor("Robotica");
        Docente docente1 = new Docente("Tiago");
        Aluno aluno1 = new Aluno("Maria");

        editor1.cadastrarSeguidor(docente1);
        editor1.cadastrarSeguidor(aluno1);

        Mensagem mensagem = new Mensagem("Hello", "Hello World");

        editor1.enviarMensagem(mensagem);

    }
}
