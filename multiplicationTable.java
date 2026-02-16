import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter table : ");
        int num = obj.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
        obj.close();
    }
}