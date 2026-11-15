package org.facade;

public class Veiculo {

    public boolean circular() {
        return VeiculoFacade.verificarPendenciasCirculacao(this);
    }
}