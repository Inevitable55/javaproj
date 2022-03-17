/* Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
 Call this method by creating an object of each of the three classes.*/
public class abstract2q {
    public static void main(String args[]) {
        Ba a = new Ba();
        Bb b = new Bb();
        Bc c = new Bc();
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}

abstract class Bank{
   abstract void getBalance();
}

class Ba extends Bank{
    public void getBalance(){
        System.out.println("100$");
    }
}

class Bb extends Bank{
    public void getBalance(){
        System.out.println("150$");
    }
}

class Bc extends Bank{
    public void getBalance(){
        System.out.println("200$");
    }
}