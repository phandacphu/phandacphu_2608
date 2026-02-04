package lec6_AraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class bt4 {

    public static void nhapMang(ArrayList<Integer> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu " + i + ": ");
            list.add(sc.nextInt());
        }
    }

    public static void hienThiTatCa(ArrayList<Integer> list) {
        System.out.println("\na) cac gia tri trong mang");
        for (int x : list) {
            System.out.print(x + " ");
        }
    }

    public static void hienThiChanVaIndex(ArrayList<Integer> list) {
                System.out.println("");

        System.out.println("\nb) gia tri chan va index");
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println("gia tri: " + list.get(i) + " tai vi tri (index): " + i);
                count++;
            }
        }
        System.out.print("\ntong co " + count + " so chan");
    }

    public static void tong(ArrayList<Integer> list) {
        int sum = 0;
        for (int x : list) {
            sum += x;
        }
        System.out.println("\nc) tong cac gia tri: " + sum);
    }

    public static void main(String[] args) {
        ArrayList<Integer> danhSach = new ArrayList<>();
        nhapMang(danhSach);
        hienThiTatCa(danhSach);
        hienThiChanVaIndex(danhSach);
        tong(danhSach);
    }
}
