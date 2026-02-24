package operation;

public class Sample {
    
    public static void main(String[] args) {
        
        Demo obj = new Demo();
        obj.name = "Shraddha";                  // public datamember can access anywhere of the program
        // obj.studentCount = 25;               // private datamember can't access outside of class
        System.out.println("Name : "+obj.name);
        obj.id = 12;   // protected can access within packges
        obj.degree = "PHD";
    }
}
