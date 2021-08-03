package AttAula10.Att2;

public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Rafael Consentino");
        g.setUser_name("rafael.consentino");
        g.setSalario(2000);
        g.setPassword("12345");

        Telefonista t = new Telefonista();
        t.setNome("Carolina Mello");
        t.setSalario(1000);
        t.setEstacaoDeTrabalho(13);

        Secretaria s = new Secretaria();
        s.setNome("Tatiane Andrade");
        s.setRamal(198);
        s.setSalario(1500);

        g.mostrarDadosG();
        t.mostrarDadosT();
        s.mostrarDadosS();
    }
}
