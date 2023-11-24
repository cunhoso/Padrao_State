package padroescomportamentais.state;

public abstract class FuncionarioEstado {

    public abstract String getEstado();

    public boolean contratar(Funcionario funcionario) {
        return false;
    }

    public boolean promover(Funcionario funcionario) {
        return false;
    }

    public boolean suspender(Funcionario funcionario) {
        return false;
    }

    public boolean demitir(Funcionario funcionario) {
        return false;
    }

    public boolean desligar(Funcionario funcionario) {
        return false;
    }

    public boolean transferirSetor(Funcionario funcionario) {
        return false;
    }
}