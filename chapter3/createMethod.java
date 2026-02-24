public class createMethod {
    
    void accept(int no){
        int sum = 0;
        for (int i = 1; i <= no; i++) {
            sum+=i;
        }
        System.out.println("Sum is : "+sum);
    }
    void getinfo(int num1){
        int fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact*=i;
        }
        System.out.println("Factorial number : "+fact);
    }
    public static void main(String[] args) {
        
        createMethod obj = new createMethod();
        obj.accept(5);
        obj.getinfo(5);
    }
}