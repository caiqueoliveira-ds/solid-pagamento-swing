package tecdes.pagamento.controller;
import tecdes.pagamento.model.Pagamento;

public class ControllerPagamento {
    public String realizarPagamento(Pagamento metodo, double valor){
        return metodo.processar(valor);
    }
}
