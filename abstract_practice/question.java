/* Create an abstract class 'Parent' with a method 'message'. 
It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and 
"This is second subclass" respectively. 
Call the methods 'message' by creating an object for each subclass. */

package abstract_practice;

abstract class Parent{
    public void message(){
        System.out.println("Abstract method message");  }

}

class A extends Parent{
    public void message(){
        System.out.println("This is message method from class A");
    }
}

class B{
    public void message(){
        System.out.println("This is message method from class B");
    }
}
public class question {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        a.message();
        b.message();


        
    }
    
}
