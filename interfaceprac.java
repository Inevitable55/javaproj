public class interfaceprac {
    public static void main(String args[]) {
       c obj = new c();
       obj.bfun();
       obj.name();
       obj.age();
}
}
    

interface prac{
    public void name();
    public int age();
}

abstract class B implements prac{
    public void name(){
        System.out.println("This is name method ");
    }
    public int age(){
        System.out.println("This is age");
        return 0;
    }
    abstract void bfun();
}

class c extends B{
     void bfun(){
         System.out.println("Bfun function");
     }
}