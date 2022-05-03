package exfix;

public class PessoaJuridica extends Contribuinte{
    private int funcionarios;

    public PessoaJuridica(String nome, double rendaAnual, int funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios(){
        return funcionarios;
    }

    @Override
    public double imposto() {
        if(funcionarios > 10){
            return super.getRendaAnual() * 0.14;
        }
        else
        return super.getRendaAnual() * 0.16;
    }
}
