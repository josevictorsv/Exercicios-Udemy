import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();

        ret.largura = sc.nextDouble();
        ret.altura = sc.nextDouble();



        System.out.println("Area: "+ ret.Area());
        System.out.println("Perimetro: "+ ret.Perimetro());
        System.out.println("Diagonal: "+ ret.Diagonal() );
    }
}
