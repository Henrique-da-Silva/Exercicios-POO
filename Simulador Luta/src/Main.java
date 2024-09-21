import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Superman superman = new Superman();
        MulherMaravilha mulherMaravilha = new MulherMaravilha();
        Thor thor = new Thor();

        while (true) {
            System.out.println("Escolha dois personagens para a luta:");
            System.out.println("1 - Superman");
            System.out.println("2 - Mulher-Maravilha");
            System.out.println("3 - Thor");
            System.out.print("Escolha o primeiro personagem: ");
            int escolha1 = scanner.nextInt();
            System.out.print("Escolha o segundo personagem: ");
            int escolha2 = scanner.nextInt();

            Lutador lutador1 = null;
            Lutador lutador2 = null;

            switch (escolha1) {
                case 1:
                    lutador1 = superman;
                    break;
                case 2:
                    lutador1 = mulherMaravilha;
                    break;
                case 3:
                    lutador1 = thor;
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    continue;}

            switch (escolha2){

                case 1:
                    lutador2 = superman;
                    break;
                case 2:
                    lutador2 = mulherMaravilha;
                    break;
                case 3:
                    lutador2 = thor;
                    break;
                default:
                    System.out.println("Escolha inválida");
                    continue; }

            while (lutador1.obterVida() > 0 && lutador2.obterVida() > 0) {

                // Lutador 1 ataca
                lutador1.atacar(lutador2);
                System.out.println("Vida restante do lutador 2: " + lutador2.obterVida());
                if (lutador2.obterVida() <= 0) {
                    System.out.println("Lutador 1 venceu!");
                    break;
                }

                // Lutador 2 ataca
                lutador2.atacar(lutador1);
                System.out.println("Vida restante do lutador 1: " + lutador1.obterVida());
                if (lutador1.obterVida() <= 0) {
                    System.out.println("Lutador 2 venceu!");
                    break;
                }
            }
            System.out.print("Deseja jogar novamente? (s/n): ");
            String novamente = scanner.next();
            if (!novamente.equalsIgnoreCase("s")) {
                break;
            }
            }








    }

}

