public class overload {

    
   public static void main(String[] args) {
       add(3,4);

   }

public static int add(int a ,int b){
    System.out.println("this is integer function");
    return a+b;
}
public static float add(float a ,float b){
    System.out.println("This is a float function");
    return a+b;
}
}