import java.util.Scanner;

public class starPrint {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);     // getting input for user using object
        System.out.print("Enter no of rows & cols : ");
        int num = obj.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();  // close object get input for user
    }
}