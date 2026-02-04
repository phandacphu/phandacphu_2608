package lec6_AraysList;

import java.util.Arrays;
import java.util.ArrayList;


public class sl6 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("huy1");
        name.add("huy2");
        name.add("huy3");
        System.out.println(name.get(0));
        
        System.out.println(name.remove("huy2"));
        System.out.println(name.remove(1));
        System.out.println(Arrays.toString(name.toArray()));

    }
}
