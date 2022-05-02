import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal;
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        int duracao;
        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }
        else{
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O jogo durou: "+ duracao +" hora(s).");
    }
}
