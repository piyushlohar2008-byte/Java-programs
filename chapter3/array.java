

public class array {
    public static void main(String[] args) {

        int numbers[] = {10, 45, 32, 67, 8, 3, 90, 2, 9};
        int min = Integer.MAX_VALUE;

        for(int number:numbers){
            if (number < min) {
                min = number;
            }
           
        }
         System.out.println("Minimum number : "+min);
    }
}