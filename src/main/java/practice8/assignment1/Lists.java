package practice8.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    /*
    * Висновок: 
    * */

    public static void main(String[] args) {
        rawTypes();
        withTypes();
    }

    private static void rawTypes() {
        List list = new ArrayList();

        list.add("a");
        list.add(45);

        String s  = (String) list.get(0);
        try {
            String n  = (String) list.get(1);
        } catch (ClassCastException e) {
            System.out.println("class cast exception on number triggered " + e.getMessage());
        }
    }

    private static void withTypes() {
        List<String> list = new ArrayList();

        list.add("a");
//        list.add(55);
    }


}
