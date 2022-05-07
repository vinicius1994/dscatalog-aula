import java.io.Serializable;
import java.util.Scanner;

public class Program implements Serializable {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int days = scanner.nextInt(12*24);
        int hs = scanner.nextInt(288*60);
        int mn = scanner.nextInt(172800*60);
        float result = scanner.nextInt(days + hs + mn);

        System.out.println("O resultado da operação é : " + result);

    }

}
