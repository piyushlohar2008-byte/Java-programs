import java.util.Scanner;

public class elseIfcondition {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter marks of four subject : ");
        int m1 = obj.nextInt();
        int m2 = obj.nextInt();
        int m3 = obj.nextInt();
        int m4 = obj.nextInt();

        int total = m1 + m2 + m3 + m4;
        float per = (total / 4);
        System.out.println("Total marks : "+total);
        System.out.println("Percentage : "+per);

        if(per>=80 && per<=100){
            System.out.println("First class");
        }
        else if(per>=60 && per<=80){
            System.out.println("Second class");
        }
        else if(per>=40 && per<=60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        obj.close();

    }
}