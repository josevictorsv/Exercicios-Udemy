import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            double p1 , p2, p3;
            p1 = sc.nextDouble();
            p2 = sc.nextDouble();
            p3 = sc.nextDouble();

            double media = (p1 * 2.0 + p2 * 3.0 + p3 * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }
        sc.close();

    }
}
