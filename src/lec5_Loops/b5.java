/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5_Loops;

import java.util.Scanner;

public class b5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter a number (-1 to quit): ");
        int number = console.nextInt();
        while (number != -1) {
            sum = sum + number;
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
        }
        System.out.println("The total is " + sum);
    }

}
