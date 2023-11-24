package padroescomportamentais.state;

public class Funcionario {

    private String nome;
    private FuncionarioEstado estado;

    public Funcionario() {
        this.estado = FuncionarioEstadoContratado.getInstance();
    }

    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
    }

    public boolean contratar() {
        return estado.contratar(this);
    }

    public boolean promover() {
        return estado.promover(this);
    }

    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean demitir() {
        return estado.demitir(this);
    }

    public boolean desligar() {
        return estado.desligar(this);
    }

    public boolean transferirSetor() {
        return estado.transferirSetor(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioEstado getEstado() {
        return estado;
    }
}