import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.facade.*;


class VeiculoTest {

    @Test
    void deveRetornarPendenciaManutencaoCirculacao() {
        Veiculo veiculo = new Veiculo();
        Manutencao.getInstancia().addVeiculoPendente(veiculo);

        assertEquals(false, veiculo.circular());
    }

    @Test
    void deveRetornarPendenciaDocumentacaoCirculacao() {
        Veiculo veiculo = new Veiculo();
        Documentacao.getInstancia().addVeiculoPendente(veiculo);

        assertEquals(false, veiculo.circular());
    }

    @Test
    void deveRetornarPendenciaMultasCirculacao() {
        Veiculo veiculo = new Veiculo();
        Multas.getInstancia().addVeiculoPendente(veiculo);

        assertEquals(false, veiculo.circular());
    }

    @Test
    void deveRetornarVeiculoSemPendenciaCirculacao() {
        Veiculo veiculo = new Veiculo();

        assertEquals(true, veiculo.circular());
    }

}
