package padroescomportamentais.state;

public class FuncionarioEstadoSuspenso extends FuncionarioEstado {

    private FuncionarioEstadoSuspenso() {
    }

    private static FuncionarioEstadoSuspenso instance = new FuncionarioEstadoSuspenso();

    public static FuncionarioEstadoSuspenso getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspenso";
    }

    public boolean contratar(Funcionario funcionario) {
        // Lógica de contratação de funcionário suspenso
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        return true;
    }

    public boolean promover(Funcionario funcionario) {
        // Lógica de promoção de funcionário suspenso
        funcionario.setEstado(FuncionarioEstadoPromovido.getInstance());
        return true;
    }

    public boolean transferirSetor(Funcionario funcionario) {
        // Lógica de transferência de setor de funcionário suspenso
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        return true;
    }

    public boolean desligar(Funcionario funcionario) {
        // Lógica de desligamento de funcionário suspenso
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        return true;
    }
}
