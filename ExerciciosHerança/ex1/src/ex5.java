import java.util.Scanner;

public class ex5 {
        public static void main(String[] args) {

            int codigo, codigo2, numero, numero2;
            double valor, valor2;

            Scanner sc = new Scanner(System.in);

            System.out.println("Código:");
            codigo = sc.nextInt();

            System.out.println("Numero: ");
            numero = sc.nextInt();

            System.out.println("Valor: ");
            valor = sc.nextDouble();

            // segunda peça

            System.out.println("Código:");
            codigo2 = sc.nextInt();

            System.out.println("Numero: ");
            numero2 = sc.nextInt();

            System.out.println("Valor: ");
            valor2 = sc.nextDouble();

            double preco = (valor * numero) + (valor2 * numero2);

            System.out.printf("O preço é: %2f.%n", preco);

    }
}
