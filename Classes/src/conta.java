public class conta {

    String titular;
    int numero, quantidade;


    public conta(String titular, int numero, int quantidade){
        this.titular = titular;
        this.numero = numero;
        this.quantidade = quantidade;

    }

    public int getnumero() {
        return numero;
    }

    public int getquantidade() {
        return quantidade;
    }

    public String gettitular() {
        return titular;
    }

}



