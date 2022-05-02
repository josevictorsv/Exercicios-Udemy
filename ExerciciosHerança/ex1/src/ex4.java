import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int funcionario, horas;
        double valorHora, salario;

        System.out.print("Funcionario:");
        funcionario = sc.nextInt();

        System.out.println("Horas e valor: ");
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horas * valorHora;
        System.out.println("Numero: "+ funcionario);
        System.out.printf("Salário : R$ %.2f%n", salario);
    }
}
