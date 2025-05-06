abstract class Marks{
    abstract int getpercentage();
}
class A extends Marks{
    int marks1;
    int marks2;
    int marks3;
    A(int marks1,int marks2, int marks3){
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }

    @Override
    int getpercentage() {
        return( marks1+ marks2 + marks3)/400;
    }
}
class B extends Marks{
    int marks1;
    int marks2;
    int marks3;
    int marks4;
    B(int marks1,int marks2, int marks3, int marks4){
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.marks4=marks4;
    }

    @Override
    int getpercentage() {
        return( marks1+ marks2 + marks3 + marks4)/400;
    }

}
public class labtask1 {
    public static void main(String[] args){
        Marks obj = new A(30,20,23);
        Marks obj2 = new B(40,42,42,50);
        System.out.println("Persentage of Student A:" + obj.getpercentage() + "%");
        System.out.println("Persentage of Student B:" + obj2.getpercentage() + "%");

    }
}
