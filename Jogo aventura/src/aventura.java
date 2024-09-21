
import java.util.Objects;
import java.util.Scanner;

public class aventura {
    public static void main(String[] args) {
        System.out.println
                ("Bem vindo a ilha misteriosa !!! Siga os desafios para encontrar o tesouro !!!");


    Scanner digitador = new Scanner(System.in);

     // variaveis

    String selva = String.valueOf(digitador);
    String ponte = String.valueOf(digitador);
    String caverna = String.valueOf(digitador);


    
    System.out.println("Trilha pela selva densa. Entrar na selva de dia ou noite ? :");
    selva = digitador.nextLine();

    if (selva.equals("dia")){
        System.out.println("Siga a trilha com cuidado. No final vai encontrar uma ponte instavel.");
        System.out.println("Ponte Instavel, escolha entre  cruzar  ponte ou  escalar rochas:");
        ponte = digitador.nextLine();

        if (ponte.equals("cruzar ponte")){
            System.out.println("Parabéns conseguil atravessar a ponte.. continue a trilha até encontrar a cachoeirra");
            System.out.println("Caverna escondida na cachoeira.Escolha entre mergulhar para entrar na caverna ou retornar para sair da ilha:");
            caverna = digitador.nextLine();

            if (caverna.equals("mergulhar")){
                System.out.println("Parabéns você encontrou o Tesouro. Esta Rico !!! ");
            } else {
                System.out.println("Que pena !!! Você não encontrou o tesouro.");
            }
        } else {
            System.out.println("Caminho perigoso, risco de queda nas rochas. Retorne e cruze a ponte.");
                          }


    } else {
        System.out.println("Caminho perigoso \n" +
                "Animais selvagens \n" +
                "Retorne, e faça a trilha de dia.");

    }










    }
}