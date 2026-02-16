
// Concept of string
public class stringConcept {
    public static void main(String[] args) {
        
        String name = "PIyush";         // Memory allocate in reference 
        String sameName = "Piyush";    
        String newName = new String("Piyush");  //Special memory allocate to the newName

        System.out.println(sameName);
        // if (name == sameName) {
        //     System.out.println("Both are same");
        // }

        // if (name == newName) {
        //     System.out.println("String are same");
        // }
        // else{
        //     System.out.println("String are not same");
        // }

        if (name.equals(newName))                // Check string object not reference
        {             
            System.out.println("name and newName have same name ");
        }
        else
        {
            System.out.println("name and newName don't have same name");
        }

        if (name.equalsIgnoreCase(newName))     // Check object and ignore camel case
        {
            System.out.println("Both string are same");
        }
    }   
}