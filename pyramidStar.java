public class pyramidStar {
    public static void main(String[] args) {
        
        Star obj = new Star();
        obj.no = 5;
        obj.operator();
    }
}

class Star{

    int no;
    void operator()
    {
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}