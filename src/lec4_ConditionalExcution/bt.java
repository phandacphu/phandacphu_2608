/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec4_ConditionalExcution;

import java.util.Scanner;

public class bt {
    public static int findMaxNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = scanner.nextInt();
        System.out.println("nhap b: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("max: " + findMaxNumber(a,b));
        }
    }
}
