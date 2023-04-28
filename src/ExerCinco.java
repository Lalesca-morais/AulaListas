import java.util.Scanner;

public class ExerCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int num, entre0e100 = 0;
        System.out.println("Digite os 20 números desejados: ");

        for (int i = 0; i < 20; i++) {
            num=input.nextInt();
            if (num >= 0 && num <= 100) {
                entre0e100++;

            }
        }
        System.out.println("Os números" +0e100+ "estão entre 0 e 100.");
    }
}
