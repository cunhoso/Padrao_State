package padroescomportamentais.state;

public class FuncionarioEstadoDesligado extends FuncionarioEstado {

    private FuncionarioEstadoDesligado() {
    }

    private static FuncionarioEstadoDesligado instance = new FuncionarioEstadoDesligado();

    public static FuncionarioEstadoDesligado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Desligado";
    }

    public boolean demitir(Funcionario funcionario) {
        // Lógica de demissão de funcionário
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        return true;
    }
}