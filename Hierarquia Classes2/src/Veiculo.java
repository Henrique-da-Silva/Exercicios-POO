public class Veiculo {

    // Objetos
    protected String marca;
    protected int ano;

    // Metodo construtor
    public Veiculo(String marca, int ano){
        this.marca=marca;
        this.ano=ano;
    }

    // metodo
    public void apresentarInformacoes(){
        System.out.println("Marca do veiculo: " + marca);
        System.out.println("Ano de fabricação " + ano);
    }

    // Subclasse Carro
    static class Carro extends Veiculo{
        int numerodePortas;

    // Construtor
    public Carro(String marca, int numerodePortas, int ano ){
        super(marca,ano);
        this.numerodePortas=numerodePortas;
    }
        // metodo
        public void apresentar() {
            super.apresentarInformacoes();
            System.out.println("Número de portas: " + numerodePortas);

    }
    }

    // Subclasse Moto
    static class Moto extends Veiculo{
        String tipoMoto;

    // Construtor
    public Moto(String marca, int ano, String tipoMoto){
        super(marca,ano);
        this.tipoMoto=tipoMoto;

    }

    // metodo
    public void apresentar() {
        super.apresentarInformacoes();
        System.out.println("Tipo de moto: " + tipoMoto);



        }
    }
}
