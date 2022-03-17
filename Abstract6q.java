/*We have to calculate the area of a rectangle, a square and a circle.
 Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking 
 two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of
  'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 
  'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 
  'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and
   circle respectively. Create an object of class 'Area' and call all the three methods.
 */
public class Abstract6q {
          public static void main(String args[]) {
              area a = new area();
              a.Rectarea(5, 3);
              a.circlearea(4);
              a.sqarea(2);
          }
}

abstract class Shape{
    abstract void Rectarea(int a,int b);
    abstract void sqarea(int a);
    abstract void circlearea(int a);

}

class area{
    void Rectarea(int a,int b){
        System.out.println("Area is- "+(a*b));
    }
    void circlearea(int a){
        System.out.println("Area is-"+3.14*a*a);
       }
    void sqarea(int a){
        System.out.println("Area is-"+a*a);
    }
}