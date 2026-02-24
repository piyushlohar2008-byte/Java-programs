import java.util.Scanner;

public class sumOfNatural {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i,sum = 0;
        System.out.print("Enter number : ");
        int no = obj.nextInt();
        for(i=1;i<=no;i++){
            sum+=i;
        }
        System.out.print("Sum is : "+sum);
        obj.close();
    }
}