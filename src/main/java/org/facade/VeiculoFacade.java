package org.facade;

public class VeiculoFacade {

    public static boolean verificarPendenciasCirculacao(Veiculo veiculo) {
        if (Documentacao.getInstancia().verificarVeiculoComPendencia(veiculo)) {
            return false;
        }
        if (Manutencao.getInstancia().verificarVeiculoComPendencia(veiculo)) {
            return false;
        }
        if (Multas.getInstancia().verificarVeiculoComPendencia(veiculo)) {
            return false;
        }
        return true;
    }
}
