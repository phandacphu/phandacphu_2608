package bt;

import java.util.Scanner;

public class bt1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap a: ");
        double a = scanner.nextInt();
        System.out.print("nhap b: ");
        double b = scanner.nextInt();
        System.out.print("nhap c: ");
        double c = scanner.nextInt();

        if (a == 0) {
            System.out.println("day ko phai chuwng trinh bac 2");
        } else {
            double denta = (b * 2) - (4 * a * c);
            if (denta == 0) {
                double x = -b / (2 * a);
                System.out.println("phuong trinh co nghiem kep: " + x);
            } else if (denta < 0) {
                System.out.println("phuong trinh vo nghiem: ");
            } else {
                double x = (-b) - (Math.sqrt(denta)) / (2 * a);
                double y = (-b) + (Math.sqrt(denta)) / (2 * a);

                System.out.println("phuong trinh co 2 nghiem phan biet: " + " x= " + x + " y= " + y);
            }

        }
    }
}
