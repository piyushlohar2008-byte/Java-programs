import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);   // taking input to user using object

        System.out.println("Enter three numbers : ");
        long a = obj.nextLong();
        long b = obj.nextLong();
        long c = obj.nextLong();

        long result = a > b ? a > c ? a : c : b > c ? b : c;  // condition of ternary operator

        System.out.println("Largest number : "+result);  // display result 

        obj.close(); // close input
    }
}
