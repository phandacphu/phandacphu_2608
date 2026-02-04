package lec6_AraysList;

import java.util.*;

public class bt1 {

    public static void main(String[] args) {
        ArrayList<String> danhSachSV = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("nhap ten sv " + i + ": ");
            String ten = scanner.nextLine();
            danhSachSV.add(ten);
        }

        System.out.println("\ndanh sach sv");
        for (String sv : danhSachSV) {
            System.out.println(sv);
        }
    }
}
