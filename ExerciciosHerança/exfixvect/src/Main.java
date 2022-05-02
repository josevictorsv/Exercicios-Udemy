import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Quarto[] quartos = new Quarto[10];

        System.out.print("Quantos quartos: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Aluguel #"+ (i + 1) + ":");
            System.out.printf("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.printf("Email: ");
            String email = sc.nextLine();

            System.out.printf("Quarto: ");
            int quarto = sc.nextInt();

            quartos[quarto] = new Quarto(nome, email, quarto);
        }

        System.out.println("Quartos ocupados.");
        for(Quarto quarto : quartos){
            if(quarto != null)
            System.out.println(quarto);
        }

    }

}
