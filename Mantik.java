import java.util.Scanner;

public class Mantik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int yas = scanner.nextInt();
        char ogrenci = scanner.next().charAt(0);

        if (yas < 18 || ogrenci == 'e') {
            System.out.println("Indirimli");
        } else {
            System.out.println("Tam");
        }
    }
}
