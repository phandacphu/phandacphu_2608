/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec3_Scanner;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hoten: ");
        String Hoten = scanner.nextLine();
        System.out.print("MSSV: ");
        int MSSV = scanner.nextInt();
        System.out.print("Ho va ten: " + Hoten + "\nMSSV: " + MSSV);
    }
}
