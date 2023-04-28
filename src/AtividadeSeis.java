import java.util.Scanner;

public class AtividadeSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int numero;
        int soma = 0;
        //não consigo rodar o código//
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o número desejados: ");
            numero = input.nextInt();
            if (i>= 0) {
                soma = soma + numero;
            }else {
                (i <= 0)
                System.out.println("Número negativo, soma = "+soma);
            }
        }
    }
}
