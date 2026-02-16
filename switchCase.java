import java.util.Scanner;

public class switchCase {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice : ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                c = a + b;
                System.out.println("Addition is : "+c);
                break;
            case 2:
                c = a - b;
                System.out.println("Substraction is : "+c);
                break;
            case 3:
                c = a * b;
                System.out.println("Multiplication is : "+c);
                break;
            case 4:
                c = a / b;
                System.out.println("Division is : "+c);
                break;
            default:
                System.out.println("Invalid entered");
        }
        sc.close();
    }
}
