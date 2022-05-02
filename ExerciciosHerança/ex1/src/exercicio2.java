import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double raio, pi, area;
        pi = 3.14159;

        System.out.println("Digite o valor: ");
        raio = sc.nextDouble();

        area = pi * raio * raio;
        System.out.printf("Resposta: %.4f%n", area);

        sc.close();




    }
}
