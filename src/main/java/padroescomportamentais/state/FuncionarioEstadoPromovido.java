package padroescomportamentais.state;

public class FuncionarioEstadoPromovido extends FuncionarioEstado {

    private FuncionarioEstadoPromovido() {
    }

    private static FuncionarioEstadoPromovido instance = new FuncionarioEstadoPromovido();

    public static FuncionarioEstadoPromovido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Promovido";
    }
}