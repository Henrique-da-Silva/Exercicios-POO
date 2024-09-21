import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String nomecao="", nomegato="";

        System.out.println("Introduza nome do Cão:");
        nomecao=scanner.nextLine();
        Animal.Cao cao = new Animal.Cao(nomecao);
        Animal.emitirSom();
        cao.Latir();

        System.out.println("Introduza nome do Gato:");
        nomegato=scanner.nextLine();
        Animal.Gato gato = new Animal.Gato(nomegato);
        Animal.emitirSom();
        gato.Miar();


    }
}