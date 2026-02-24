
public class stringClass {
    
    public static void main(String[] args) {
        
        // String name = "   Piyush Lohar";
        // System.out.println(name.toUpperCase());   // convert string into uppercase
        // System.out.println(name.toLowerCase());   // convert string into lowercase

        // System.out.println(name.trim());   // remove space 
        String s1 = "Welcome to java programming, java is good language ";

        // System.out.println(s1.contains("Hello"));    // print that variable content

        // String s2 = "Wrap";
        // System.out.println(s2.replace("W", "T")); // replace a character
        // System.out.println(s2.concat(" Text"));   // add new line

        // System.out.println(s2.indexOf("p"));      // print index of character

        String firstName = "Shraddha";
        // String lastName = " Khapra";
        // System.out.println(firstName.concat(lastName));

        // System.out.println(s2.length());

        // String newName = "Samarth Lohar";
        // System.out.println(newName.replace("Samarth", "Piyush"));

        System.out.println(firstName.charAt(3));   // return character at index n
        System.out.println(s1.substring(11,15 ));   
        // gives substring starting form n(th) index upto m(th)

        System.out.println(s1.substring(11));
        // gives substring starting from n(th) index
    }
}