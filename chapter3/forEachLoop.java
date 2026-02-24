public class forEachLoop {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int n:arr){
            System.out.println("Number : "+n);
        }
    }
}