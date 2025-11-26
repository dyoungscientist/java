import java.util.Scanner;

public class Excersise1{
    public static double calorieBurnt( double height, double distance){
        double calBurn = 0.653*height*distance;
        return calBurn;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double mWeight, mDistance, tCalories;
        System.out.print ("Enter your weight in pounds");
        mWeight = sc.nextDouble();
        System.out.print ("Enter distance covered");
        mDistance = sc.nextDouble();
    tCalories = calorieBurnt(mWeight,mDistance);
    System.out.print("Calories burned: " + tCalories);
    }
   
}
/*  public static double average (int a, int b, int c){
        double Avg;
        Avg=a+b+c/2;
        return Avg;
    }
    volumeBox(2, 3, 1);
    public static double area( int l, int b){
    Ar= l*b;
    return Ar;
   }
   public static double area(int l, int b){
    ArR= 2*(l+b);
    return ArR;
   }
   public static double area(int h, int b){
    ArT= 0.5*b*h;
    return ArT;
   }
     Integer.parseInt("234")
     Float.parseFloat ("12.34")
     // these are wrapped classes,they are classes that contain methods but usesd as methods
*/
