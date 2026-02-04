package lec6_AraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class sl7 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("huy1");
        names.add("huy2");
        names.add("huy3");

        System.out.println("names[]=" + Arrays.toString(names.toArray()));
        System.out.println("name[0]=" + names.get(0));
        System.out.println(names.remove("Huy2"));
        System.out.println(names.remove(1));
        System.out.println("names[]=" + Arrays.toString(names.toArray()));
    }

}
