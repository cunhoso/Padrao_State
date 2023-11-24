package padroescomportamentais.state;

public class FuncionarioEstadoContratado extends FuncionarioEstado {

    private FuncionarioEstadoContratado() {
    }

    private static FuncionarioEstadoContratado instance = new FuncionarioEstadoContratado();

    public static FuncionarioEstadoContratado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contratado";
    }

    public boolean promover(Funcionario funcionario) {
        // Lógica de promoção de funcionário
        funcionario.setEstado(FuncionarioEstadoPromovido.getInstance());
        return true;
    }

    public boolean suspender(Funcionario funcionario) {
        // Lógica de suspensão de funcionário
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        return true;
    }

    public boolean demitir(Funcionario funcionario) {
        // Lógica de demissão de funcionário
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        return true;
    }

    public boolean desligar(Funcionario funcionario) {
        // Lógica de desligamento de funcionário
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        return true;
    }

    public boolean transferirSetor(Funcionario funcionario) {
        // Lógica de transferência de setor de funcionário
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        return true;
    }
}