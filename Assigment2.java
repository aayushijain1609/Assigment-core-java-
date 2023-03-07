import java.util.*;
public class Assigment2{
    /**
     * @param args
     */
    public static void main(String[] args) {
        try{
           do{

            int choice = 0;
            Scanner sc = new Scanner(System.in);
           
        
           
                
                    choice = 0;
                    System.out.println();
                    System.out.print("Enter your choice(in numbers): ");
                    choice = sc.nextInt();  
                    choice = sc.nextInt();

                switch (choice) {
                    case 1:
                    try{
                  Circle c = new Circle(); 
                    c.permeter();
                    c.area();
                }
                catch(Exception e){
                 System.out.println("Not valid");
                }
                break;

        case 2:
         try{
            Rectangle re=new Rectangle();
            re.pereminter1();
            re.area1();

         }
         catch( Exception e){
            System.out.println("invalid");
         } break;
         case 3:
         try{
            Square sq= new Square();
            sq.area2();
            sq.pereminter2();

         }
         catch(Exception e){
          System.out.println("invalid");
         }
         case 4:
         try{
            Cube cube=new Cube();
            cube.volume();
            cube.surfacearea();
         }
         catch( Exception e){
   System.out.println("invalid");
}
 case 5:
 try{
    Triangle triangle=new Triangle();
    triangle.area3();
 }
 catch(Exception e){
    System.out.println("invalid");
 }
case 6:
try{
Sphere sp=new Sphere();
sp.vol();
sp.sa();
}
catch(Exception e){
    System.out.println("invalid");
} break;
case 7:
try{
    Cylinder cy = new Cylinder();
    cy.sua();
    cy.v();

} catch(Exception e){
    System.out.println("invalid");
} break;
default:

 try{
    System.out.println(" nothing is out over here");
 }               
catch( Exception e){
    System.out.println("invalid");
}
                
            } 
        
    class cricle{
        public static void main(String[] args) {
            int radius=5;
            try
                        {

                                double area, perimeter; 
                                area = 3.14 * radius * radius;     
                                perimeter=2 * 3.14 * radius;

                                System.out.println("Area of Circle: " + area);
                                System.out.println("Perimeter of Circle: " + perimeter);
                        }
                        catch(Exception e)
                     {
                                 System.out.println("Error : "+e);                       
                       }   
            
                }        }
            

 class Rectangle{
 public static void main(String[] args) {
    int l=2,b=4;
    try{
         int area1,pereminter1;
         pereminter1=2*(l+b);
         area1=l*b;
         System.out.println("perimeter of rectangle " +pereminter1);
         System.out.println("area of rectangle"+area1);
    }
    catch(Exception e){
        System.out.println("Error : "+e);   
 }
}
 }
 class Square{
    public static void main(String[] args) {
        int side=4;
        try{
            int area2,pereminter2;
            area2=4*side;
            pereminter2=4*side;
            System.out.println("area and permeter of sqaure is:" +area2 +pereminter2);

        }
        catch(Exception e)
        {
            System.out.println("Error : "+e);   
 }
        }
    }

    class cube{
        public static void main(String[] args) {
            float len=3.50f;
            try{
                float surfacearea,volume;
                surfacearea=6*(len*len);
                volume=len*len*len;
                System.out.println("");
            }
            catch(Exception e){
                System.out.println("error"+e);
            }
        }
    }
class Triangle{
        public static void main(String[] args) {
            int bh=3;int h=2;
            try{
                int area3;
                area3=(bh*h)/2;
                System.out.println("area of triangle is:"+area3);
            }
            catch(Exception e){
                System.out.println("error"+e);
            }
        }
}
class Sphere{
    public static void main(String[] args) {
        int r=3;
        double pie=3.1415;
        try{
            double vol,sa;
            vol=(4.0/3.0)*pie*(r*r*r);
            sa=4*pie*(r*r);
            System.out.println("volume of sphere " +vol);
            System.out.println("surface area" +sa);
        }
        catch(Exception e){
            System.out.println("error"+e);
        }
    }
}
class Cylinder{
    public static void main(String[] args) {
        
    
    int height=5;
    int radus=10;
    float p= 3.14;
    
    try{
        double v,sua;
        v=pe*(radus*radus)*height;
        sua=2*pe*radus*(height+radus);
        System.out.println("vol of cy"+v);
        System.out.println("vol of sua"+sua);

    }
        catch (Exception e) {
        System.out.println("error " +e);
        }
    
    }
 

           
        }
    
    
  


 
