public class encap {
    public static void main(String[] args) {
        Student s1 = new Student();
        float val = 100000;
        s1.setbal(val);
        float bis= s1.getbal();
        System.out.println(bis);
    }
}

class Student{
    private float bal;

    public void setbal(float b) {
        this.bal= b;
        }

    public float getbal() {
            return bal;
        }    
}          