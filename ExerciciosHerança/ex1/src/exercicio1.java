import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Digite o primeiro: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo: ");
        b = sc.nextInt();

        soma = a + b;
        System.out.println("Soma: "+ soma);

    }

}
