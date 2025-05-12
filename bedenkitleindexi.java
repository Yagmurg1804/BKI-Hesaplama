
import java.util.Scanner;

public class BedenKitleIndexi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu girin: ");
        int kilo = scanner.nextInt();

        System.out.println("Boyunuzu girin (örnek: 1.71): ");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);
        System.out.printf("Beden Kitle İndeksiniz: %.2f\n", bki);
    }
}
