
import java.util.*;


public class Arraylist2 {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Noor",21,"Narshingdi");
        Student s2 = new Student(102,"Anabil",22,"Dhamrai");
        Student s3 = new Student(103,"Rose",22,"Natore");
        Student s4 = new Student(104,"Nadia",21,"Narshingdi");
        
        //Creating ArrayList
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        //Creating iterator
        Iterator i = list.iterator();
        
        while(i.hasNext()){
            Student st = (Student)i.next();
            System.out.println(st.id+" "+st.name+" "+st.age+" "+st.address);
            
        }
        
    }
    
}
