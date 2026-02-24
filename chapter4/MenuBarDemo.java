import java.awt.*;

public class MenuBarDemo extends Frame{
    
    MenuBarDemo() {
        setLayout(null);
        setVisible(true);
        setSize(350,400);
        setTitle("Menu Bars");

        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu file = new Menu("Color");
        Menu exit = new Menu("Exit");
        mb.add(file);
        mb.add(exit);
    }
    public static void main(String[] args) {
        new MenuBarDemo();
    }
}