

public class overriding {
    public static void main(String[] args) {
         B obj = new B();
         obj.hello();
    }
}

class A{
    public void hello() {
        System.out.println("This is method belongs to class A ");
    }
}


class B extends A{
     public void hello() {
         System.out.println("This function belongs to the derived class");
         super.hello();
     }
}

    
