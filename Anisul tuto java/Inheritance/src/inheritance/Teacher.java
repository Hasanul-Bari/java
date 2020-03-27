
package inheritance;

public class Teacher extends Person {
    
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    
    
    void display2(){
        
        System.out.println("Name = "+getName());
        System.out.println("Age = "+getAge());
        System.out.println("Qualification = "+qualification);
        
    }
    
}
