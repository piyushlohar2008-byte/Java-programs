public class thisStudent {
    
    public static void main(String[] args) {
        
        Student obj = new Student("Piyush", "Java", 33, 88.89f);
        obj.show();

    }
}

class Student{

    String name;
    String subject;
    int rollno;
    float marks;

    Student(String name, String subject, int rollno, float marks)
    {
        this.name = name;
        this.subject = subject;
        this.rollno = rollno;
        this.marks = marks;
    }
    void show()
    {
        System.out.println("Student name : "+name);
        System.out.println("Student subject : "+subject);
        System.out.println("Student rollno : "+rollno);
        System.out.println("Student marks : "+marks);        
    }
}