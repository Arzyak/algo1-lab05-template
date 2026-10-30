import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Kitap ara");
                break;
            case 2:
                System.out.println("Odunc al");
                break;
            case 3:
                System.out.println("Iade et");
                break;
            case 0:
                System.out.println("Cikis");
                break;
            default:
                System.out.println("Gecersiz secim");
                break;
        }
    }
}