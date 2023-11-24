package padroescomportamentais.state;

public class FuncionarioEstadoTransferido extends FuncionarioEstado {

    private FuncionarioEstadoTransferido() {
    }

    private static FuncionarioEstadoTransferido instance = new FuncionarioEstadoTransferido();

    public static FuncionarioEstadoTransferido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Transferido";
    }

    public boolean contratar(Funcionario funcionario) {
        // Lógica de contratação de funcionário transferido
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        return true;
    }

    public boolean promover(Funcionario funcionario) {
        // Lógica de promoção de funcionário transferido
        funcionario.setEstado(FuncionarioEstadoPromovido.getInstance());
        return true;
    }

    public boolean suspender(Funcionario funcionario) {
        // Lógica de suspensão de funcionário transferido
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        return true;
    }

    public boolean desligar(Funcionario funcionario) {
        // Lógica de desligamento de funcionário transferido
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        return true;
    }
}