package boxvolume;


public class Box {
    
    double height,weight,depth;
    Box(double h,double w,double d){
        height=h;
        weight=w;
        depth=d;
    }
    
    void displayVol(){
        System.out.println("Volume = "+(height*weight*depth));
    }
    
}
