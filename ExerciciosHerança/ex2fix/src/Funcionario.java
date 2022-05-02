public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }
    public double Salario(){

        return salarioBruto - imposto;
    }
    public void aumentoSalario(double porcentagem){
        this.salarioBruto =  this.salarioBruto + (this.salarioBruto * (porcentagem / 100));
    }
    public String toString(){
        return "Funcionário: " + nome + ", $ "+ Salario();
    }
}
