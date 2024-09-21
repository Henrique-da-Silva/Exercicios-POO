import java.util.Scanner;
import java.util.Random;
public class Carro {

    // membros da classe
    static String vencedor;
    String nome;
    int velocidade;

    // método construtor que aceita o nome e a velocidade do carro como argumentos e inicializa esses
    //valores.
    public Carro(String nome, int velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    // método correr
    public void correr() {
        Random random = new Random();
        int tempo = random.nextInt(10) + (10 - velocidade); 
        System.out.println("O carro " + nome + " está correndo...");
        System.out.println("Tempo da corrida: " + tempo + " segundos");
        if (vencedor == null || tempo < Integer.parseInt(vencedor.split(":")[1])) {
            vencedor = nome + ":" + tempo;
        }
}
}
