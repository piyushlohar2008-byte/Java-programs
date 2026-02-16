import java.util.Scanner;

public class starplusPrint {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);  // taking input to user using object

        System.out.print("Enter value : ");
        int no = obj.nextInt();
        int mid = (no/2);             // formula of mid 

        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no; j++) {
                if (i == mid || j == mid) {      // condition (i == mid || j == mid) then print (*)
                    System.out.print("*");
                } 

                else {
                    System.out.print(" ");    // else print empty space
                }
                
            }
            System.out.println();
        }

        obj.close();  // close input object
    }
}
