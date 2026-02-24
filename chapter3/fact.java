import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter number : ");
        int no = obj.nextInt();
        for (int i = 1; i <= no; i++) {
            fact*=i;
        }
        System.out.print("Factorial no : "+fact);
        // System.out.println(76*35);
        obj.close();
    }
}