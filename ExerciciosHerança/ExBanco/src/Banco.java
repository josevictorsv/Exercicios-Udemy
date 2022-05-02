public class Banco {
    private double saque, deposito;
    private double Saldo = 0;
    private final int conta;
    private String nome;

    public Banco(int conta, String nome, double depositoInicial) {
        this.Saldo = depositoInicial;
        this.conta = conta;
        this.nome = nome;
    }
    public Banco(int conta, String nome) {
        this.Saldo = Saldo;
        this.conta = conta;
        this.nome = nome;
    }
    public void depositar(double deposito){
        this.Saldo += deposito;
    }
    public void saque(double saque){
        this.Saldo -= saque + 5;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return Saldo;
    }

    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("Conta atualizada %n")+
                "Conta: " + conta +
                ", Nome: " + nome +
                ", Saldo: " + String.format("%.2f", Saldo) ;
    }
}
