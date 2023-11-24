package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
    }

    // Funcionario contratado

    @Test
    public void naoDeveContratarFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    public void devePromoverFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertTrue(funcionario.promover());
        assertEquals(FuncionarioEstadoPromovido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveSuspenderFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertTrue(funcionario.suspender());
        assertEquals(FuncionarioEstadoSuspenso.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveDesligarFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertTrue(funcionario.desligar());
        assertEquals(FuncionarioEstadoDesligado.getInstance(), funcionario.getEstado());
    }

    // Funcionario suspenso

    @Test
    public void deveContratarFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        assertTrue(funcionario.contratar());
        assertEquals(FuncionarioEstadoContratado.getInstance(), funcionario.getEstado());
    }

    @Test
    public void devePromoverFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        assertTrue(funcionario.promover());
        assertEquals(FuncionarioEstadoPromovido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveSuspenderFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        assertFalse(funcionario.suspender());
    }

    @Test
    public void deveDesligarFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        assertTrue(funcionario.desligar());
        assertEquals(FuncionarioEstadoDesligado.getInstance(), funcionario.getEstado());
    }

    // Funcionario promovido

    @Test
    public void naoDeveContratarFuncionarioPromovido() {
        funcionario.setEstado(FuncionarioEstadoPromovido.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    public void naoDevePromoverFuncionarioPromovido() {
        funcionario.setEstado(FuncionarioEstadoPromovido.getInstance());
        assertFalse(funcionario.promover());
    }

    @Test
    public void naoDeveSuspenderFuncionarioPromovido() {
        funcionario.setEstado(FuncionarioEstadoPromovido.getInstance());
        assertFalse(funcionario.suspender());
    }

    @Test
    public void naoDeveDesligarFuncionarioPromovido() {
        funcionario.setEstado(FuncionarioEstadoPromovido.getInstance());
        assertFalse(funcionario.desligar());
    }

    // Funcionario desligado

    @Test
    public void naoDeveContratarFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    public void naoDevePromoverFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.promover());
    }

    @Test
    public void naoDeveSuspenderFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.suspender());
    }

    @Test
    public void naoDeveDesligarFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.desligar());
    }

    // Funcionario transferido

    @Test
    public void naoDeveContratarFuncionarioTransferido() {
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    public void naoDevePromoverFuncionarioTransferido() {
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        assertFalse(funcionario.promover());
    }

    @Test
    public void naoDeveSuspenderFuncionarioTransferido() {
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        assertFalse(funcionario.suspender());
    }

    @Test
    public void naoDeveDesligarFuncionarioTransferido() {
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        assertFalse(funcionario.desligar());
    }
}