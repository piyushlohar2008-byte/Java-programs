public class methodOverriding extends Rectangle{
    int radius;
    float PI = 3.14f;
    void area()
    {
        super.area();
        float area_of_circle = radius * radius * PI;
        System.out.println("Area of circle : "+area_of_circle);
    }
    public static void main(String[] args) {
        
        methodOverriding obj = new methodOverriding();
        obj.radius = 2;
        obj.area();

    }
}

class Rectangle{

    int length = 10, width = 20;

    void area()
    {
        int area_of_rectangle = length * width;
        System.out.println("Area of rectangle : "+area_of_rectangle);
    }
}