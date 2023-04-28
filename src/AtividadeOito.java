import java.util.Scanner;
public class AtividadeOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double salario, salreajustado;

        System.out.println("Digite o salário: ");
        salario = input.nextDouble();

        while (salario != -1) {
            System.out.println("Informe o reajuste");
            salreajustado = salario * (salario/100);
            System.out.println("Salário com reajuste: ");
            System.out.println();
            salario = input.nextDouble();
        }
    }
}
