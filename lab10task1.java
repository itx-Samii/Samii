interface Display{
     void show();
}
interface Aircraft extends Display{
    void aircraftType();
    void calculateCapacity();
}
class PassengerJet implements Aircraft{
    int rows = 5;
    int seatsPerRows = 10;
    String AircraftType = "PassengerJet";

    @Override
    public void aircraftType() {

        System.out.println("Aircraft Type: "+ AircraftType);

    }

    @Override
    public void calculateCapacity() {
        int capacity = rows*seatsPerRows;
        System.out.println("Total seats: "+ capacity);
    }

    @Override
    public void show() {
        System.out.println("Details:");
        aircraftType();
        calculateCapacity();
    }
}
class CargoPlane implements Aircraft{
    int lenght = 10, width = 15;
    String AircraftType = "CargoPlane";

    @Override
    public void aircraftType() {

        System.out.println("Aircraft Type: "+ AircraftType);

    }
    @Override
    public void calculateCapacity() {
        int capacity = lenght*width;
        System.out.println("Total Capacity: "+ capacity);
    }
    public void show() {
        System.out.println("Details:");
        aircraftType();
        calculateCapacity();
    }
}
class PrivateJet implements Aircraft{
    int seats = 10;
    String AircraftType = "PrivateJet";

    @Override
    public void aircraftType() {

        System.out.println("Aircraft Type: "+ AircraftType);

    }
    @Override
    public void calculateCapacity() {
        System.out.println("Total Capacity: "+ seats);

    }
    public void show() {
        System.out.println("Details:");
        aircraftType();
        calculateCapacity();
    }
}




public class lab10task1 {
    public static void main(String [] args){
        PassengerJet obj = new PassengerJet();
        obj.show();
        CargoPlane obj1 = new CargoPlane();
        obj1.show();
        PrivateJet obj2 = new PrivateJet();
        obj2.show();

    }
}
