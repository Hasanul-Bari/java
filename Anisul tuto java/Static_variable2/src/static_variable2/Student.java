package static_variable2;


public class Student {
    
     static int count=0;
    Student(){
        count++;
    }
    
    void totalStudent(){
        System.out.println("totalStudent = "+count);
    }
    
}
