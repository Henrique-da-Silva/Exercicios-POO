public class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    // construtor
    public ContaBancaria(int numeroConta, String nomeTitular, double saldo){

        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;

    }

    // método depositar
    public void depositar (double valor){

        if (valor>0){
            this.saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");

        }else {
            System.out.println("Valor inválido para depósito");
        }

    }

    // Método para levantar
    public void levantar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Levantamento de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para levantamento.");
        }


    }
    // Método para verificar saldo
    public double verificarSaldo() {
        return this.saldo;
    }
    // Acessar numero da conta
    public int getNumeroConta(){
        return this.numeroConta;
    }
    // Acessar nome titular
    public String getNomeTitular(){
        return this.nomeTitular;
    }
    // Modificar nome do Titular
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
