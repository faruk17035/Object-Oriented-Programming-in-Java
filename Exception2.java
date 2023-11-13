
public class Exception2 {
    public static void main(String[] args) {
        System.out.println("Hello-----");
        try{
        int x=10;
        int y=0;
        
        int result = x/y;
        System.out.println("Result = "+result);
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
        finally{
        System.out.println("Exception Handling is an important features");
        System.out.println("Exception Handling is an important features");
        }
    }
    /*
    int x=20;
    int y=0;
    int result = x/y;ArithmeticException
    
            
    String st = null;
    System.out.println(st.charAt(0));NullpointerException
            
    
    String st2 = "Daffodil";
    System.out.println(st2.charAt(10)); StringIndexOutOfBoundsException
            
    int n = Integer.parseInt("DIU"); NumberFormatException
            
    File file = new File("D/OOP/exception.txt"); FileNotFoundException
            
    int a[] = new int[5];
    a[6]=12112023;//ArrayIndexOutOfBoundException
    
    classNotfoundexceprtion
    ioexception
    etc..... 
*/
    
    
}
