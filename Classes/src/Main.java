public class Main {
    public static void main(String[] args) {

        conta conta1 = new conta("Henrique", 121314, 10000);
        conta conta2 = new conta("Joice", 121315, 20000);

        if (conta1.getquantidade() < conta2.getquantidade()){
            System.out.println("Joice possui mais saldo em conta !!!");
        } else if (conta1.getquantidade() > conta2.getquantidade()) {
            System.out.println("Henrique possui mais saldo em conta !!!");

        } else {
            System.out.println("Henrique e Joice possuem mesmo saldo em conta !!!");
        }


    }


}
