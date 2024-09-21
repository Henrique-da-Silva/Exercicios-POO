abstract class Personagem implements Lutador{
   protected int vida;

   public Personagem(int vida){
       this.vida = vida;
   }
   public void defender(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
    }
    public int obterVida() {
        return vida;
    }

}

class Superman extends Personagem{
    public Superman(){
        super(100);
    }
    public void atacar(Lutador oponente) {
        System.out.println("Superman ataca!");
        oponente.defender(20);
    }

}

class MulherMaravilha extends Personagem{
    public MulherMaravilha(){
        super(90);
    }
    public void atacar(Lutador oponente){
        System.out.println("Mulher maravilha ataca!");
        oponente.defender(18);
    }
}

class Thor extends Personagem{
    public Thor(){
        super(110);
    }

    public void atacar(Lutador oponente){
           System.out.println("Thor ataca!");
           oponente.defender(22);
    }
}


