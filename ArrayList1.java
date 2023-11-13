
import java.util.ArrayList;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("OOP in java");
        list.add("OOP in Python");
        list.add("SP");
        list.add("SP Lab");
        System.out.println(list);
        list.remove("SP");
        System.out.println(list);
        System.out.println(list.get(2));
    }
    
}
