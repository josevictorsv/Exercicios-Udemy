import java.util.Scanner;

public class exer3 {
    public static void main(String[] args){

        int A, B, C, D, diferenca;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = (A*B) - (C*D);

        System.out.println("Diferença: "+ diferenca);
    }
}
