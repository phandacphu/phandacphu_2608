package lec6_AraysList;

import java.util.*;
public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            System.out.print("nhap so nguyen: ");
            int so = scanner.nextInt();
            number.add(so);
        }
        
        System.out.println("\ncac so le");
        for(Integer n : number){
            if(n%2 != 0){
                System.out.println(n);
            }
        }
    }
}
