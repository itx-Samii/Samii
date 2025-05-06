import java.util.Scanner;
public class twodimentionalarray {
    public static void main(String[] args) {
        int table_data[][];
        table_data = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 9 elements of the array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table_data[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table_data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The elements of the array in reverse order are: ");
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(table_data[i][j] + " ");
            }
            System.out.println();
        }
    }
}