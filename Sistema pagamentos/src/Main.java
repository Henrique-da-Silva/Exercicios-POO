import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("\n1 - Pagamento com cartão de crédito");
        System.out.println("2 - Pagamento com Paypal");

        int escolha = scanner.nextInt();

        FormaDePagamento formaDePagamento = null;

        switch (escolha) {
            case 1:
                formaDePagamento = new FormaDePagamento.CartaoCredito();
                break;
            case 2:
                formaDePagamento = new FormaDePagamento.Paypal();
                break;
            default:
                System.out.println("Opção inválida!");
                return;

        }

        formaDePagamento.processarPagamento();
    }}
