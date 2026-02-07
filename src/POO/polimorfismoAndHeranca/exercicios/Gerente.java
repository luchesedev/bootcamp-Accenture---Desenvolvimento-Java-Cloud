package POO.polimorfismoAndHeranca.exercicios;

import POO.polimorfismoAndHeranca.aulas.Employee;

public non-sealed class Gerente extends Funcionario {

    public Gerente(boolean isAdmin) {
        IsAdmin = isAdmin;
    }

    protected boolean IsAdmin;

    public boolean isAdmin() {
        return this.IsAdmin = true;
    }

    private void GerarRelatorio(Employee employee){

    }


}
