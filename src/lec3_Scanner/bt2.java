/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec3_Scanner;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ho va ten: ");
        String name = scanner.nextLine();

        System.out.print("Student ID: ");
        int ID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Hometown: ");
        String home = scanner.nextLine();

        System.out.print("GPA: ");
        float gpa = scanner.nextFloat();
        scanner.nextLine(); 

        System.out.print("Major: ");
        String major = scanner.nextLine();

        System.out.print("Scholarship (true/false): ");
        boolean scho = scanner.nextBoolean();
            
        System.out.println("Ho va ten: " + name);
        System.out.println("MSSV: " + ID);
        System.out.println("Hometown: " + home);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("Scholarship: " + scho);
    }
}

