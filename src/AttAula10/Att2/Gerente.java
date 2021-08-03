package AttAula10.Att2;

public class Gerente extends Funcionario{
    private String user_name;
    private String password;

    public double calculaBonificacao(){
        return this.getSalario() * 0.1 + 100;
    }

    public void mostrarDadosG(){
        System.out.println("\n Dados Gerente");
        this.mostrarDados();
        System.out.println("Usuario: " + getUser_name());
        System.out.println("Senha: " + getPassword());
        System.out.println("Bonificacao: " + calculaBonificacao());
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
