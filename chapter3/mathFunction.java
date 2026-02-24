public class mathFunction {
    public static void main(String[] args) {
        
        long a = 10;
        long b = 7;
        System.out.println("Minimum number : "+Math.min(a, b)); // find minimum value

        int x = 45;
        int y = 18;
        System.out.println("Maximum number : "+Math.max(x, y));  // find Maximum value

        double s = 34;
        System.out.println("Square root : "+Math.sqrt(s)); // getting square root

        double p1 = 2, p2 = 3;
        System.out.println("Power : "+Math.pow(p1, p2));  // get square or power of another variable 

        double no = -78.98;
        System.out.println("Absolute value : "+Math.abs(no)); // absolute value convert - to +

        System.out.println(Math.floor(5.3));   // print smallest value before decimal point

        System.out.println(Math.ceil(5.9));  // print largest value after decimal point

        System.out.println("Random number : "+Math.random());  // print random numbers

        double p = 3.8;
        System.out.println("Round value : "+Math.round(p));  // get round value 
    }
}