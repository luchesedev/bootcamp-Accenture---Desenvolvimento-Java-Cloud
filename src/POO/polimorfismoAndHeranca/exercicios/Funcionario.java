package POO.polimorfismoAndHeranca.exercicios;

public sealed abstract class Funcionario permits Atendente,Vendedor,Gerente {
    protected String name;

    protected  String email;

    protected  String senha;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
