import java.util.Scanner;

public class daysoftheweek {
    public static void main(String[] args) {
        System.out.println("Enter day number between 1 to 7: ");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day) {
            case 1:
                System.out.println("Monday (Weekday");
                break;
            case 2:
                System.out.println("Tuesday (Weekday");
                break;
            case 3:
                System.out.println("Wednesday (Weekday");
                break;
            case 4:
                System.out.println("Thursday (Weekday");
                break;
            case 5:
                System.out.println("Friday (Weekday");
                break;
            case 6:
                System.out.println("Saturday (Weekend)");
                break;
            case 7:
                System.out.println("Sunday (Weekend)");
                break;


        }
    }
}
