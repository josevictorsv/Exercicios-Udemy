import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.println("Nome: ");
                String nome = sc.nextLine();

                System.out.println("Salário bruto: ");
                double salarioB = sc.nextDouble();

                System.out.println("Imposto: ");
                double imposto = sc.nextDouble();

                Funcionario f1 = new Funcionario(nome, salarioB, imposto);

                System.out.println("Funcionário cadastrado");
                System.out.println("----------------------");
                System.out.println("Funcionário: "+ nome + ", R$"+ salarioB + "Taxa: "+ imposto);


                System.out.println("Qual a porcentagem do aumento: ");
                double porcentagem = sc.nextDouble();
                f1.aumentoSalario(porcentagem);

                System.out.println("Atualizado.");
                System.out.println("Funcionário: "+ f1);

                  System.out.println("Obrigado.");





    }
}
