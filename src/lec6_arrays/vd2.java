package lec6_arrays;

import java.util.Scanner;

public class vd2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("kich thuoc mang: ");
        int a = scanner.nextInt();
        int[] number = new int[a];
        
        for (int i = 0; i < a; i++) {
            System.out.print("nhap phan tu mang: ");
            number[i] = scanner.nextInt();
        }
        System.out.print("mang: ");
        for (int i = 0; i < a; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
