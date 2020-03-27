package filedemo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args){

        File dir = new File("person");
        dir.mkdir();           //directory will be created

        System.out.println(dir.getAbsolutePath());
        System.out.println(dir.getName());

        //dir.delete();
        String loc = dir.getAbsolutePath();

        File f1 = new File(loc + "/Student.txt");
        File f2 = new File(loc + "/teacher.txt");

        try {
            f1.createNewFile();
            f2.createNewFile();
            System.out.println("Files are created");

        } catch (Exception e) {
            System.out.println(e);
        }

        //f1.delete();
        System.out.println(f1.exists());

        //write into a file
        Scanner input = new Scanner(System.in);
        int id;
        String name;

        try {
            Formatter fm = new Formatter(loc + "/student.txt");

            fm.format("Hello" + " Hasan\r\n");
            for(int i=0; i<3; i++)
            {
                id=input.nextInt();
                name=input.next();
                fm.format(id+" "+name+"\r\n");
                
            }

            fm.close();

        }catch (FileNotFoundException e) {
            System.out.println(e);
        }

        //read from file
        try {
            Scanner fs = new Scanner(f1);    //f1-> student.txt

            while (fs.hasNext()) {
                String s = fs.nextLine();   // perfect way
                System.out.println(s);
                /*id=fs.nextInt();
                name=fs.next();
                System.out.println(name+" "+id);*/
            }
            fs.close();

        }catch(Exception e){
            System.out.println(e);
        }
            

    }

}
