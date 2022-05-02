package exemp;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N funcionarios: ");
        int n = sc.nextInt();

        ArrayList<Employee> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Horas: ");
            int hours = sc.nextInt();

            System.out.print("Valor por hora: ");
            Double valuePerHour = sc.nextDouble();

            System.out.println("Terceirizado? y/n");
            char ch = sc.next().charAt(0);

            if(ch == 'y'){
                System.out.print("Despesa adcional: ");
                Double additionalCharge = sc.nextDouble();

                Employee emp = new OutsourcedEmployee(name, hours,valuePerHour, additionalCharge);
                list.add(emp);
            }
            else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        System.out.println("Pagamentos: ");
        for(Employee emp : list){
            System.out.println(emp);
        }
    }
}
