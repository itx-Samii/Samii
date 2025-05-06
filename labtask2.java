abstract class Bank1{
    abstract int getbalance();
}
class BankA extends Bank1{
    int balance;
    BankA(int balance){
        this.balance=balance;
    }
    @Override
    int getbalance() {
        return balance;
    }
}
class BankB extends Bank1{
    int balance;
    BankB(int balance){
        this.balance=balance;
    }
    @Override
    int getbalance() {
        return balance;
    }

}
class BankC extends Bank1{
    int balance;
    BankC(int balance){
        this.balance=balance;
    }
    @Override
    int getbalance() {
        return balance;
    }
}
public class labtask2 {
    public static void main(String[] args){
        Bank1 obj1 = new BankA(100);
        Bank1 obj2 = new BankB(150);
        Bank1 obj3 = new BankC(200);

        System.out.println("Balance of BankA: " + obj1.getbalance()+ "$");
        System.out.println("Balance of BankB: " + obj2.getbalance()+ "$");
        System.out.println("Balance of BankC: " + obj3.getbalance()+ "$");


    }
}
