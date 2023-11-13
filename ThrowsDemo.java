public class ThrowsDemo {
    static int divide(int x,int y) throws Exception{
        return x/y;
    }
    public static void main(String[] args) {
        try{
            divide(10,0);
        }
        catch(Exception e){
            System.out.println("Error is divide method");
        }
    }
    
}
