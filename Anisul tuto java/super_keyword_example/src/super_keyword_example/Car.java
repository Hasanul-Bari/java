package super_keyword_example;


public class Car extends Vehicle {
    
    int gear;
    
    Car(String c,double w,int g){
        super(c,w);   //calling constructor of vehicle class 
        gear=g;
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Gear : "+gear);
    }
}
