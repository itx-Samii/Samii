abstract class Seat {
    abstract int Calculate_Seat_Price(int noofseat);
}
class BusinessClass extends Seat{
    int price;
    BusinessClass(int price){
        this.price=price;
    }

    @Override
    public int Calculate_Seat_Price(int noofseat) {
        System.out.println("Available Seats in Business Class: " + noofseat);
        System.out.println("Per Seats Price in Business Class: " + price+ "$");
        System.out.println("Price of Business Class Seats: " + (noofseat * price)+ "$");
        return 0;
    }
}
class FirstClass extends Seat{
    int price ;
    FirstClass(int price){
        this.price=price;
    }
    @Override
    public int Calculate_Seat_Price(int noofseat) {
        System.out.println("Available Seats in First Class: " + noofseat);
        System.out.println("Per Seats Price in First Class: " + price+ "$");
        System.out.println("Price of First Class Seats: " + (noofseat * price)+ "$");
        return 0;    }
}
class EconomyClass extends Seat{
    int price;
    EconomyClass(int price){
        this.price=price;
    }
    @Override
    public int Calculate_Seat_Price(int noofseat) {
        System.out.println("Available Seats in Economy Class: " + noofseat);
        System.out.println("Per Seats Price in Economy Class: " + price+ "$");
        System.out.println("Price of Economy Class Seats: " + (noofseat * price)+ "$");
        return 0;    }
}
public class Labtask4 {
    public static void main(String [] args){
        System.out.println("Seats in Business Class: ");
        Seat obj1 = new BusinessClass(150);
        obj1.Calculate_Seat_Price(3);
        System.out.println("Seats in First Class: ");
        Seat obj2 = new FirstClass(200);
        obj2.Calculate_Seat_Price(2);
        System.out.println("Seats in Economy Class: ");
        Seat obj3 = new EconomyClass(100);
        obj3.Calculate_Seat_Price(1);

    }
}
