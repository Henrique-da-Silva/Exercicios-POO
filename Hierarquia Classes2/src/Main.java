import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Criar um Carro");
        System.out.println("Marca: ");
        String marcarCarro = scanner.nextLine();
        System.out.println("Ano: ");
        int anoCarro = scanner.nextInt();
        System.out.println("Número de Portas: ");
        int numeroPortas = scanner.nextInt();
        scanner.nextLine();

        Veiculo.Carro carro=new Veiculo.Carro(marcarCarro, anoCarro, numeroPortas);

        System.out.println("\nInformações do Carro");
        carro.apresentar();

        System.out.println("\nCriar uma Moto:");
        System.out.println("Marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.println("Ano: ");
        int anoMoto = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tipo: ");
        String tipoMoto = scanner.nextLine();

        Veiculo.Moto moto=new Veiculo.Moto(marcarCarro, anoMoto, tipoMoto);

        System.out.println("\nInformações da Moto");
        moto.apresentar();

    }
}