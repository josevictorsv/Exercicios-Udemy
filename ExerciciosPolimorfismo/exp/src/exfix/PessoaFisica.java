package exfix;

import java.util.Scanner;

public class PessoaFisica extends Contribuinte{
    Scanner sc = new Scanner(System.in);
    private double gastos;

    public PessoaFisica(String nome, double rendaAnual, double gastos) {
        super(nome, rendaAnual);
        this.gastos = gastos;
    }

    public double getGastos() {
        return gastos;
    }


    @Override
    public double imposto() {
        if (super.getRendaAnual() >= 20000) {
            if (gastos > 0) {
                return super.getRendaAnual() * 0.25 - gastos / 2;
            } else
                return super.getRendaAnual() * 0.25;
        }
        else return super.getRendaAnual() * 0.15;
    }
}

