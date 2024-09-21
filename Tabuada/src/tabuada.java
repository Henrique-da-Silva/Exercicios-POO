import java.util.Random;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        System.out.println("Bem Vindo ao jogo da tabuada !!!");
        System.out.println("Objetivo do jogo é responder corretamente para ganhar pontos.");


        Scanner digitador = new Scanner(System.in);
        Random ramdom = new Random();
        int multiplicador, numero, resposta, pontos=0;
        multiplicador = ramdom.nextInt(9) + 1;
        numero = ramdom.nextInt(10) + 1;

            System.out.println("Insira a resposta da multiplicação");
            System.out.println(numero + " x " + multiplicador + " = ");
            resposta = digitador.nextInt();
            pontos+=10;




        while (resposta == numero*multiplicador){

            System.out.println("Parabéns acertou !!!\nVocê tem " + pontos + " pontos" );
            multiplicador = ramdom.nextInt(9) + 1;
            numero = ramdom.nextInt(9) + 1;
            System.out.println("Insira a resposta da multiplicação");
            System.out.println(numero + " x " + multiplicador + " = ");
            resposta = digitador.nextInt();
            pontos+=10;

            } System.out.println("Você errou !!! Inicie novamente e boa sorte !!!");







    }
}