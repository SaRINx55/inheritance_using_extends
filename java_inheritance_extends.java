package inheritance;

public class Casio {//original work of the program
    public void add(int i, int j){
        System.out.println(i+j);
    }
}
//Now, inheritance is used to reduce redundancy by using some methods of a class, i.e parent class in the child class

class CasioAdvanced extends Casio{
    public void subtract(int i, int j){
        System.out.println(i-j);
    }

    public static void main(String[] args) {
        CasioAdvanced c1= new CasioAdvanced();
        c1.subtract(5,4);
        c1.add(5,4);
    }
}
