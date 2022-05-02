import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int in, out;
        in = 0;
        out = 0;

        int N = sc.nextInt();

        for(int i = 0; i < N ; i++){
            int x = sc.nextInt();

            if(x >= 10 && x <= 20){
                in = in + 1;
            }
            else {
                out = out + 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}
