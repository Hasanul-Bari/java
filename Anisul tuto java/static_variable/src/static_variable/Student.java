
package static_variable;

public class Student {
    
    String name;
    int id;
    static String universityName="Hstu";
    
    Student(String n,int i)
    {
        name=n;
        id=i;
        //universityName=u;
        
    }
    
    void display(){
        System.out.println("Name = "+name);
        System.out.println("ID = "+id);
        System.out.println("University = "+universityName);
        System.out.println("\n");
    }
    
}
