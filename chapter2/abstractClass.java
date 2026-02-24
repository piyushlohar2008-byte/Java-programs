package packages1;

public class abstractClass extends Pet {

    static{
        System.out.println("Details of all animal - ");
    }

    void petData(String n, int a){
        System.out.println("Pet name : "+n);
        System.out.println("Pet age : "+a);
    }
    
    void animalData(String n,int l){
        System.out.println("Animal name : "+n);
        System.out.println("Animal legs : "+l);
    }

    public static void main(String[] args) {
        
        abstractClass obj = new abstractClass();
        obj.petData("Cat", 3);
        obj.animalData("lion", 4); 
    }
}

abstract class Pet extends Animal{
    abstract void petData(String name,int age);
    // abstract void petDetails();
}

abstract class Animal{
    abstract void animalData(String name,int legs);
    // abstract void animalDetails();

}