
package StudentList;

import java.util.LinkedList;

public class StudentList {
    
    public static void main(String[] args) {
        
        LinkedList<Student> list=new LinkedList();
        
        Student s1=new Student(65,"Hasan","cse");
        Student s2=new Student(66,"Jisan","cse");
        Student s3=new Student(67,"Bishal","cse");
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        for(Student s : list){
            System.out.println(s.id+" "+s.name+" "+s.dept);
        }
        
        /*
        list.forEach((Student s) -> {
            System.out.println(s.id+" "+s.name+" "+s.dept);
        });
        */
        
        
    }
    
}
