/* An abstract class has a construtor which prints "This is constructor of abstract class",
 an abstract method named 'a_method' and a non-abstract method which prints
  "This is a normal method of abstract class". A class 'SubClass' inherits the abstract class and 
  has a method named 'a_method' which prints "This is abstract method".
   Now create an object of 'SubClass' and call the abstract method and the non-abstract method. 
(Analyse the result)*/
public class Abstract4q {
 public static void main(String args[]) {
     SubClass a = new SubClass();
     a.a_method();
     a.nonab();
 }  
}

abstract class QWE{
    QWE(){
        System.out.println("This is a constructor of abstract class");
    }
    abstract void a_method();
    public void nonab(){
        System.out.println("This is a normal method of abstract class");

    }
    }

class SubClass extends QWE{
    void a_method(){
        System.out.println("This is abstract method");
    }
}