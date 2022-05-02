package ex149;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Number of products: ");
        int n = sc.nextInt();

        for(int i = 0; i < n ; i++){
            System.out.print("Common, used or imported (c/u/i)");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if(ch == 'c'){
                list.add(new Product(name,price));
            }
            else if(ch == 'u'){
                System.out.print("Date: ");
                Date date = sdf.parse(sc.next());

                list.add(new UsedProduct(name, price, date));
            }
            else{
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                list.add(new ImportedProduct(name,price,customsFee));
            }
        }
        System.out.println();
        System.out.println("Price tag:");

        for(Product prod : list){
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}
