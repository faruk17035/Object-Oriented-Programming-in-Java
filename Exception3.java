
import java.util.*;


public class Exception3 {
    public static void main(String[] args) {
        while(true){
        try{
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int num1 = sc.nextInt();
        
        System.out.println("Please enter number 2: ");
        int num2 = sc.nextInt();
        
        int ans = num1/num2;
        System.out.println("Result = "+num1+"/"+num2+"="+ans);
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
            System.out.println("invalid input-->Please try again.....");
        }
        
    }
    }
    
}
