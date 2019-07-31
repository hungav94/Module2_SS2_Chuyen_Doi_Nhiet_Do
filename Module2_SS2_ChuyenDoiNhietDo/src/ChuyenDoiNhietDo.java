import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c, f;
        int choise;
        do {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Do F sang do C");
            System.out.println("2. Do C sang do F");
            System.out.println("0. Exit");
            System.out.print("Chon: ");
            choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Nhap do F");
                    f = scanner.nextDouble();
                    System.out.print("Do C la: " + doFSangDoC(f));
                    break;
                case 2:
                    System.out.println("Nhap do C");
                    c = scanner.nextDouble();
                    System.out.print("Do F la: " + doCSangDoF(c));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choise != 0);
    }

    public static double doCSangDoF(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }

    public static double doFSangDoC(double f) {
        double c = 5.0 / 9 * (f - 32);
        return c;
    }
}
