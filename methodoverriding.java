public class methodoverriding{
public static void main(String args[]) {
        derived obj = new derived();
        obj.method();
        

        
    }
    
}

class base{
    public void method(){
            System.out.println("This belongs to base class");
    }
}

class derived extends base{
    public void method(){
        System.out.println("This belongs to derived class");
        super.method();
      }
      
}
