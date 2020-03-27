package static_variable;

public class Test {
    
    public static void main(String[] args) {
        
        Student s1=new Student("Hasan",1702065);
        s1.display();
        
        Student s2=new Student("Jisasn",1702066);
        //s2.universityName="Pust";
        //Student.universityName="Pust";
        s2.display();
        //s1.display();
        
        System.out.println(Student.universityName);
        
    }
    
}
