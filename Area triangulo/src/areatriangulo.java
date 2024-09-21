import java.util.Scanner;

public class areatriangulo {
    public static void main(String[] args){

        // variaveis

        Double a, b, c, area, semip, perimetro;


        Scanner digitador1 = new Scanner(System.in);
        Scanner digitador2 = new Scanner(System.in);
        Scanner digitador3 = new Scanner(System.in);

        System.out.println("Calcular area do triangulo");
        System.out.println("Digite valor do lado a:");
        a=digitador1.nextDouble();
        System.out.println("Digite o valor do lado b:");
        b=digitador2.nextDouble();
        System.out.println("Digite o valor do lado c:");
        c=digitador3.nextDouble();


        if(a+b>c || b+c>a){

            perimetro=a+b+c;

            semip=perimetro/2;

            area=Math.sqrt(semip*(semip-a)*(semip-b)*(semip-c));

            System.out.println("Area= "+area);

        if (a.equals(b) && b.equals(c) && a.equals(c)){
            System.out.println("Triangulo Equilatero");
        } else if (a.equals(b) && b!=c || b.equals(c) && c!=a || a.equals(c) && c!=b){
            System.out.println("Triangulo Isósceles");
        } else {
            System.out.println("Triangulo Escaleno");
        }


        }
        else {
            System.out.println("As medidas não obedecem a condição existência do triângulo, insira novos dados.");
        }




    }

}