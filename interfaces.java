public class interfaces {
    public static void main(String args[]) {
        base obj = new base();

        obj.name();
        obj.disp();
    }
}

interface inter{
    abstract public void name();
    public int disp();
}

class base implements inter{
    public void name(){
        System.out.println("Writing defination of name method in implementing class");
    }
    public int disp(){
        this.name();
        return 0;
    }
}