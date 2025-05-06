class Bank{
    public int getintrest(){
        return 0;
    }
};
class SBI extends Bank{
    public int getintrest(){
        return 8;
    }
};
class ICICI extends Bank{
    public int getintrest(){
        return 7;
    }
};
class AXIS extends Bank{
    public int getintrest(){
        return 9;
    }
};

public class prectice1 {
    public static void main(String[] args){
        SBI a = new SBI();
        ICICI b= new ICICI();
        AXIS c = new AXIS();
        System.out.println("SBI Intrest rate:" + a.getintrest() );
        System.out.println("ICICI Intrest rate:" + b.getintrest() );
        System.out.println("AXIS Intrest rate:" + c.getintrest() );
    }
}
