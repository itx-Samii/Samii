class Person {
     String personname;
     int age;

    public Person(String personname, int age)
    {
        this.personname = personname;
        this.age = age;
    }

    public void print()
    {
        System.out.println("Name: " + personname);
        System.out.println("Age: " + age);
    }
}

class Patient extends Person {
     String diseaseType;
     String recommendedMedicine;

    public Patient(String personname, int age, String diseaseType, String recommendedMedicine)
    {
        super(personname, age);
        this.diseaseType = diseaseType;
        this.recommendedMedicine = recommendedMedicine;
    }
    public void print()
    {
        super.print();
        System.out.println("Disease Type: " + diseaseType);
        System.out.println("Recommended Medicine: " + recommendedMedicine);
    }
}

class MedicarePatient extends Patient
{
     String hospitalName;
     String wardName;
     int roomNumber;

    public MedicarePatient(String personname, int age, String diseaseType, String recommendedMedicine,String hospitalName, String wardName, int roomNumber) {
        super(personname, age, diseaseType, recommendedMedicine);
        this.hospitalName = hospitalName;
        this.wardName = wardName;
        this.roomNumber = roomNumber;
    }
    public void print() {
        super.print();
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Ward Name: " + wardName);
        System.out.println("Room Number: " + roomNumber);
    }
}

public class  task0{
    public static void main(String[] args) {
        Person obj1 = new MedicarePatient("Zain", 18, "pain", "...", "Quaid-Azam", "Emergency", 15);
        obj1.print();
}
}