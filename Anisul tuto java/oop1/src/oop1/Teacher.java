package oop1;


public class Teacher {
    
    String name,gender;
    int phone;
    
    void setInfo(String n,String g, int ph){
        
        name=n;
        gender=g;
        phone=ph;
    }
    
    void display(){
        
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Phone = "+phone);
        System.out.println("\n");
    }
    
    int getphone()
    {
        return phone;
    }
    
}
