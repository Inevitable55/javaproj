/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and 
in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. 
The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for
 student B. 
Create an object for eac of the two classes and print the percentage of marks for both the students. */


public class Abstract3q {
    public  static void  main(String args[]) {
        A a = new A(20,40,30);
        B b = new B(10,20,30,40);
        System.out.println(a.getPercentage());
       System.out.println(b.getPercentage());
    }
}


abstract class Marks{
    abstract public float getPercentage();
}


 class A extends Marks{
        int m1,m2,m3;
             public A(int m1,int m2,int m3){
              this.m1=m1;
              this.m2=m2;
              this.m3=m3;
            }
         public float getPercentage(){
             int add = this.m1+this.m2+this.m3;
             int res = (add/3)*100;
            return res;
            
        }
    }
  class B extends Marks{
            int m1,m2,m3,m4;
                 public B(int m1,int m2,int m3,int m4){
                  this.m1=m1;
                  this.m2=m2;
                  this.m3=m3;
                  this.m4=m4;
                }
             public float getPercentage(){
                 float add = this.m1+this.m2+this.m3+this.m4;
                 float res = (add/4)*100;
                return res;
                
            }        

    }



/*public class Abstract3q {
    public static void main(String[] args) {

        A a = new A(70, 50, 100);
    
           System.out.println(a.getPercentage());
    
           B b = new B(90, 75, 64, 86);
    
           System.out.println(b.getPercentage());
    
    }
    
    }
    
    abstract class  Marks {
    
       public abstract float getPercentage();
    
    }
    
    class A extends Marks{
    
       int marks1, marks2, marks3;
    
       A(int m1, int m2, int m3){
    
           marks1=m1;
    
           marks2=m2;
    
           marks3=m3;
    
       }
    
       public float getPercentage(){
    
           float total=((marks1+marks2+marks3)/(float)300)*100;
    
           return total;
    
       }
    
    }
    
    class B extends Marks{
    
       int marks1, marks2, marks3, marks4;
    
       B(int m1, int m2, int m3, int m4){
    
           marks1=m1;
    
           marks2=m2;
    
           marks3=m3;
    
           marks4=m4;
    
       }
    
       public float getPercentage(){
    
           float total=((marks1+marks2+marks3+marks4)/(float)400)*100;
    
           return total;
    
       }
    
    }*/
    