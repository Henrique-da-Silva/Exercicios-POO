public class FormaDePagamento {
    public void processarPagamento(){
        System.out.println("O pagamento esta sendo processado");
    }

public static class CartaoCredito extends FormaDePagamento{

        public void processarPagamento(){
            System.out.println("Processando pagamento com cartão de crédito");
        }
}

public static class Paypal extends FormaDePagamento{

        public void processarPagamento(){
            System.out.println("Processando pagamento com Paypal");
        }
}
}
