package bt;

import java.util.Scanner;

public class bt3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.print("nhap: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("cac so chia het cho 3 hoac 5: "+i);
                count++;
            }
        }
        System.out.println("co " + count + " so 4chia het cho 3 hoac 5");

    }
}
