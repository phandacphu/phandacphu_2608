package lec6_arrays;

import java.util.Arrays;

public class vd {

    public static void main(String[] args) {
        int[] number = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = 2 * i;
        }
        System.out.println("number[]= " + Arrays.toString(number));
    }
}
