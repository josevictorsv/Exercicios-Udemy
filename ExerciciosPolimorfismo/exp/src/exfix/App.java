package exfix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Quantos contribuintes? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.print("Física ou Jurídica? f/j");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if(ch == 'f'){
                System.out.print("Gastos: ");
                double gastos = sc.nextDouble();

                list.add(new PessoaFisica(nome, rendaAnual,gastos));
            }
            else if(ch == 'j'){
                System.out.print("Número de fúncionarios: ");
                int funcionarios = sc.nextInt();

                list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
            }
        }
        System.out.println();
        double soma = 0;
        System.out.println("Impostos:");
        for(Contribuinte c : list){
            System.out.println(c.getNome() + ": $" + String.format("%.2f",c.imposto()));
            soma += c.imposto();
        }
        System.out.println("Total de impostos: "+ soma);
    }
}
