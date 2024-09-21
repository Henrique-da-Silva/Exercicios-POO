import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random ran = new Random();
        int numeroAleatorio = ran.nextInt(100000);
        int numeroAleatorio2 = ran.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira nome do titular da conta: ");
        String titular = scanner.nextLine();

        ContaBancaria novaconta = new ContaBancaria(numeroAleatorio, titular ,numeroAleatorio2);

     System.out.println("Conta: " +novaconta.getNumeroConta());
     System.out.println("Titular: "+novaconta.getNomeTitular());
     System.out.println("\nSaldo da Conta: "+novaconta.verificarSaldo());

     System.out.println("Insira o valor do depósito:");
     double deposito = scanner.nextDouble();
     novaconta.depositar(deposito);
     System.out.println("\nSaldo: "+ novaconta.verificarSaldo());

     System.out.println("Insira o valor do levantamento:");
     double levantamento = scanner.nextDouble();
     novaconta.levantar(levantamento);
     System.out.println("\nSaldo "+novaconta.verificarSaldo() );

    }

}