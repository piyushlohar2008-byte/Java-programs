
abstract class demo{         // define abstract class

    int x;
    String name;
    int age;
    void write(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    void read(int x)
    {
        this.x = x;
    }
    abstract void compute();
    abstract void display();        // always define method as a abstract keyword
}

public class abstractClass extends demo{
    
    void display()
    {
        System.out.println("Person name : "+name);
        System.out.println("Person age : "+age);
    }
    void compute()
    {
        System.out.println("Value of x : "+x);
    }
    public static void main(String[] args) {
        
        abstractClass obj = new abstractClass();
        obj.read(10);
        obj.write("Piyush", 18);
        obj.display();
        obj.compute();
    }
}