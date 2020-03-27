
package method_overriding;


public class Teacher extends Person{
    
    String qualification;
    
    
    
    @Override
    void DisplayInformation(){      ///akane static dewa jache na,but final dewa jache
        
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification);
        
        
    }
    
}
