package lec6_arrays;

import java.util.Scanner;

public class bt3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so ngay: ");
        int day = scanner.nextInt();
        int[] number = new int[day];

        for (int i = 0; i < day; i++) {
            System.out.print("nhiet do cua ngay " + i + " : ");
            number[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < day; i++) {
            sum += number[i];
        }
        double tb = sum / day;
        int tong = 0;
        for (int i = 0; i < day; i++) {
            if (number[i] > tb) {
                tong++;
            }
        }

        System.out.println("nhiet do trung binh" + tb);
        System.out.println("tong cac ngay nhiet do cao hon trung binh  " + tong);

    }
}
