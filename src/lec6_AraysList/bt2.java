package lec6_AraysList;

import java.util.*;

public class bt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> danhsachST = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.print("nhap so thuc: ");
            String so = scanner.nextLine();
            danhsachST.add(so);
        }

        System.out.println("cac so thuc ");
        for (String st : danhsachST) {
            System.out.print(st + " ");
        }
    }
}
