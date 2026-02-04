package bt;

import java.util.Scanner;
public class bt2 {
    public static void main(String[] args) {
        int sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        
        for(int i =1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
