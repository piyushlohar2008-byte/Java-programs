
public class methods {
    public static void main(String[] args) {
        
        int calculateAvg = average(4, 6);  // store result average in calculateAvg variable
        System.out.println("Average is : "+calculateAvg);

        greet();  // calling method greet in main function

        // int palindRome = Natural(12321);       // store result to the variable palindRome
        // System.out.println("Number : "+palindRome); 

        int palind = Natural(12321);

        if(palind == Natural(12321)){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }

    public static int average(int a,int b){
        int avg = (a+b)/2;
        return avg;
    }

    public static int Natural(int no){
       int pal=0,digit=0,temp;
       temp = no;
       while (no!=0) {
        digit = no % 10;
        pal = (10*pal) + digit;
        no /= 10;
       }
        if (temp == pal) {
            return pal;       // return pal to the main function
        }
        else{
            return -1;        // condition false then return -1
        }

        // in return_type int always return a value
    }
    static void greet(){
        System.out.println(1);
        System.out.println(5);
        System.out.println("Hii i am greet method");  

        // in return_type void do not return value
    }
}