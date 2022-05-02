import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double depositoInicial = 0;

        System.out.printf("Número conta: ");
        int conta = sc.nextInt();
        Banco banco;
        System.out.printf("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.printf("Deseja deposito inicial? S/N");
        char escolha = sc.next().charAt(0);


        if(escolha == 's'){
            System.out.print("Depósito: ");
            double deposito = sc.nextDouble();

            banco = new Banco(conta, nome, deposito);
            System.out.printf("%n");

        }else{
            banco = new Banco(conta, nome);
        }

        System.out.print(banco);
        System.out.println();

        System.out.printf("%n Depósito: ");
        double deposito = sc.nextDouble();
        banco.depositar(deposito);

        System.out.print(banco);
        System.out.println();

        System.out.printf("%n Saque: ");
        double sacar = sc.nextDouble();
        banco.saque(sacar);

        System.out.println(banco);


    }




}
