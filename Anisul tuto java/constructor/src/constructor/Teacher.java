package constructor;

public class Teacher {
    
    String name,gender;
    int phone;
    Teacher()
    {
        System.out.println("Default constructor");
    }
    
    Teacher(String n,String g, int ph) // constructor
    {
        
        name=n;
        gender=g;
        phone=ph;
    }
    
    Teacher(String n,String g) // overloaded constructor
    {
        
        name=n;
        gender=g;
    }
    
    
    
    void display(){
        
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Phone = "+phone);
        System.out.println("\n");
    }
    
}
