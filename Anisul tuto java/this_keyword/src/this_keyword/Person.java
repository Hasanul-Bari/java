package this_keyword;

public class Person {
    
    String name;
    int age;
    String haircolor;
    
    Person(String name,int age){
        this.name=name;   // with instance variable
        this.age=age;
    }
    
    Person(String name,int age,String haircolor){
        this(name,age);  //with constructor
        this.haircolor=haircolor;
    }
    
    void message (){
        System.out.println("This is message");
    }
    
    
    
    void display(){
        this.message();    //with method.  akhane this na dileo chole
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Haircolor = "+haircolor);
    }
    
}
