/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5_Loops;

import java.util.Scanner;
public class b6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        int sum =0;
        
        System.out.print("nhap number: ");
        int number = scanner.nextInt();
  
        while(number != 0){
            sum = sum + number;
            System.out.print("nhap number: ");
            number = scanner.nextInt();

        }
        System.out.println("KQ sum: " + sum);
    }
}
