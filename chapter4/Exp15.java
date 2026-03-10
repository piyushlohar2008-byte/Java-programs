import java.awt.*;

public class Exp15 extends Frame{
    Exp15()
    {
        MenuBar mb = new MenuBar();
        Menu name = new Menu("Name");
        Menu no = new Menu("Rollno");

        name.add(new MenuItem("Piyush"));
        name.addSeparator();
        name.add(new MenuItem("Aditya"));
        name.addSeparator();
        name.add(new MenuItem("Aryan"));
        name.addSeparator();
        name.add(new MenuItem("Raj"));

        no.add(new MenuItem("33"));
        no.add(new MenuItem("31"));
        no.add(new MenuItem("26"));
        no.add(new MenuItem("28"));

        mb.add(name);
        mb.add(no);
        setMenuBar(mb);
        setSize(600,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Exp15();
    }
}