public class methodoverloading {
    public static void main(String args[]) {
       add(5.0,3.3);

    }
        
    
    
static void add(int a , int b){
    System.out.println(a + b);
    
}

static void add(float a,float b){
    System.out.println(a+b);
}

static void add(Double a,Double b){
    System.out.println(a+b);
  } 
}
