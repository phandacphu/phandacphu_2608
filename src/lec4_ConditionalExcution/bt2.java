/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec4_ConditionalExcution;

import java.util.Scanner;

public class bt2 {

    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x: ");
        int x = scanner.nextInt();
        System.out.println("nhap y: ");
        int y = scanner.nextInt();
        
        System.out.println("diem thuoc goc phan tu thuoc " + quadrant(x,y));

    }
}
