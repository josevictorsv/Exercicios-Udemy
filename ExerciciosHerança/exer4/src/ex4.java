import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N ; i++){
            double a,b;
            a = sc.nextDouble();
            b = sc.nextDouble();

            if (b == 0) {
                System.out.println("Divisao impossivel.");
            }
            else{
                System.out.println(a/b);
            }
        }

    }
}
