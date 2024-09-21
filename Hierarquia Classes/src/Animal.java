public class Animal {

    protected String nome;

    // construtor
    public Animal(String nome){

    this.nome = nome;
}

    // método emitir som animal
    public static void emitirSom(){
        System.out.println("O animal emite um som");
    }

    // Subclasse Cao que herda do Animal
    public static class Cao extends Animal{
        Cao(String nome){
            super(nome);
        }
        public void Latir(){
            System.out.println("O cão esta latindo !!!");
    }
}

    // Subclasse Gato que herda do Animal
    public static class Gato extends Animal{
        Gato(String nome){
            super(nome);
        }
    public void Miar(){
            System.out.println("O gato esta miando !!!");
        }

    }

}
