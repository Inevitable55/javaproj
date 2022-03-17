/*
Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with
a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. 
Now create an object for each of the subclasses and call their respective methods. */
public class Abstract5q {
    public static void main(String args[]) {
        Cats c = new Cats();
        Dogs d = new Dogs();
        c.cats();
        d.dogs();
        d.cats();
    }
}


abstract class Animals{
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals{
    public void cats(){
        System.out.println("Cats Meow");
    }
    public void dogs(){}
}

class Dogs extends Animals{
    public void dogs(){
        System.out.println("Dogs Bark");
    }
    public void cats(){System.out.println("Cats bark");}
}