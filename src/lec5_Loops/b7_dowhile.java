/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5_Loops;

import java.util.Scanner;

public class b7_dowhile {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String phrase;
        do {
            System.out.print("Type your password: ");
            phrase = console.next();
        } while (!phrase.equals("duytan"));
    }
    
}
