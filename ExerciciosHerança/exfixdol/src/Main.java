import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        double value = sc.nextDouble();

        System.out.println("Valor gasto: "+ CurrencyConverter.CurrencyConverter(price,value));
    }
}
