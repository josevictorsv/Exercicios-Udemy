import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N funcionarios.");
        int n = sc.nextInt();


        List<Employee> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Horas: ");
            int hours = sc.nextInt();

            System.out.print("Valor por hora: ");
            Double valuePerHour = sc.nextDouble();

            System.out.println();
            System.out.println("É terceirizado? y/n");
            char ch = sc.next().charAt(0);
            if(ch == 'y'){
                System.out.println();
                System.out.print("Despesa: ");
                Double additionalCharge = sc.nextDouble();

                Employee emp = new OutsorcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            }
            else {
                Employee emp = new Employee(name, hours,valuePerHour);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("Pagamentos: ");
        for(Employee emp : list){
            System.out.println(emp);

        }
    }
}
