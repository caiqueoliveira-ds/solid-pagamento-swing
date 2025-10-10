package tecdes.pagamento.model;

public class BoletoPagamento implements Pagamento {

    @Override
    public String processar(double valor) {
        return "Pagamento de R$" + valor + " gerou um boleto bancário.";
    }
    
}
