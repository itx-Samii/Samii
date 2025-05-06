abstract class Parent{
    abstract int multiply(int a, int b);
}
abstract class  Child extends Parent{
}
class Child1 extends Child{
    @Override
    int multiply(int a, int b) {
        return a*b;
    }
}
public class Activity1 {
    public static void main(String[] args){
        Child1 obj = new Child1();
        System.out.println("Multipy = " + obj.multiply(12,10));
    }
}
