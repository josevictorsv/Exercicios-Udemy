public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public String getNome(){
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }
    public String toString() {
        double notaFinal = (nota1 + nota2 + nota3);
        if ((notaFinal < 60)) {
            System.out.println("Nota: "+ notaFinal);
            System.out.println("Rodou!");
            return "Faltam: " + (60 - notaFinal);
        } else
            System.out.println("Nota: " + notaFinal);
        return "Passou!";
    }
    }

