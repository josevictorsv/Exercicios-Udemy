import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A,B,C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double triangulo, circulo, trapezio, quadrado, retangulo;
        double pi = 3.14159;

        triangulo = (A * C / 2);
        circulo = (pi * C * C);
        trapezio = (A + B) * C / 2;
        quadrado = Math.pow(B,2);
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

    }

}
