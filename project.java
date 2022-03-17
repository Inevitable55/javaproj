import java.util.Scanner;

/**
 * project
 */
 class agar{
    private String oc;
    private String nig;
            agar(){
                this.oc=null;
                this.nig=null;
            }
           agar(String oc,String nig){

             this.oc = oc;
             this.nig = nig;
            }
         public void display(){
             System.out.println(this.oc+" "+this.nig);
         }   
        }
public class project {
    
    

    public static void main(String args[]) {
        //System.out.println("Hello");
        
        //Scanner get = new Scanner(System.in);
        
        agar ob = new agar("this is oc","This is nig");
        ob.display();
        


    }

}