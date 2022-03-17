public class abstracter {
    public static void main(String args[]) {
        base obj = new base();
        obj.methof();
        obj.displ();
        
    }
    
}

abstract class abss{
    abstract int methof();
    void displ(){
        System.out.print(this.methof());
        
    }
}
class base extends abss{
    public int methof(){
        System.out.println("This is the defination of abstract function");
        return 0;
    }
}