import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        int mediaApro;
        double n1, n2, n3, n4, mediaEx, NumAluno;


        System.out.println("Informe a matrícula do aluno: ");
        NumAluno = notas.nextInt();

        System.out.println("Informa a primeira nota do aluno: ");
        n1 = notas.nextInt();

        System.out.println("Informa a segunda nota do aluno: ");
        n2 = notas.nextInt();

        System.out.println("Informa a terceira nota do aluno: ");
        n3 = notas.nextInt();

        System.out.println("Informa a quarta nota do aluno: ");
        n1 = notas.nextInt();

        mediaApro= (int) (n1 + (n2*2) + (n3*3) + mediaEx)/7;

        String Nota;
        if (mediaApro >=90) {
            Nota = "A";
        }else if (mediaApro >= 75 <= 90) {
            Nota = "B";
        }else if (mediaApro >= 60 <= 75) {
            Nota = "C";
        }else if (mediaApro >= 40 <= 60) {
             Nota = "D";
        }else {
            Nota = "E";
        }
        String situacao;
        if (Nota.equals("A") || Nota.equals("B") || Nota.equals("C")) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        System.out.println("\nAluno: " + NumAluno);
        System.out.println("Notas: " +n1+ ", " +n2+ ", " +n3);
        System.out.println("Média dos exercícios: " + mediaEx);
        System.out.println("Média de aproveitamento: " + mediaApro);
        System.out.println("NOTA : " +Nota);
        System.out.println("Situação: " +situacao);

        notas.close();


    }
}




