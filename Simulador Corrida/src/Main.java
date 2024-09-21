import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando carros
        Carro carro1 = new Carro("Toyota", 220);
        Carro carro2 = new Carro("Honda", 240);
        Carro carro3 = new Carro("Ford", 210);

        // Apresentando opções para o usuário
        System.out.println("Escolha o carro para competir:");
        System.out.println("1. Toyota");
        System.out.println("2. Honda");
        System.out.println("3. Ford");
        int escolha = scanner.nextInt();

        // Competição
        switch (escolha) {
            case 1:
                carro1.correr();
                break;
            case 2:
                carro2.correr();
                break;
            case 3:
                carro3.correr();
                break;
            default:
                System.out.println("Escolha inválida.");
        }

        // Exibindo o vencedor
        System.out.println("O carro vencedor é: " + Carro.vencedor.split(":")[0]);
        System.out.println("Tempo da corrida: " + Carro.vencedor.split(":")[1] + " segundos");

        scanner.close();
    }
}
