
public class Student {
    
    public static void main(String[] args) {
         
        Information obj1 = new Information("Piyush", 17);
        Information obj2 = new Information("Aditya", 21,87);
        obj1.output();
        obj2.output();
    }
}

class Information{

    String name;
    int age;
    int marks;
    Information(String n,int a){
        name = n;
        age = a;
        marks = 0;
    }
    Information(String n,int a,int m){
        name = n;
        age = a;
        marks = m;
    }
    void output(){
        System.out.println("Student name : "+name);
        System.out.println("Student age : "+age);
        System.out.println("Student marks : "+marks);
    }
}