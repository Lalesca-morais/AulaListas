import java.util.Scanner;
public class ExerUm {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         int c;

        System.out.println("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = input.nextInt();

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.printf("O resultado é %d", c);
    }
}
