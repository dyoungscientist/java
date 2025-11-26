import java.util.Scanner;

public class Student {
    int age;
    String sex;
    String name;
   double bonusInput;
    static double RATE = 0.1;
    double calculateBonus(double bonusInput){
        return RATE * bonusInput;
    }
   
    public static void main(String[] args){// the start of the program
        Scanner input = new Scanner (System.in);// to take input from the user
         Student Dara = new Student();// object instasiation
        Dara.age = 17;
        Dara.sex = "Female";
        Dara.name= "Darasimi";
        Dara.bonusInput= 30;
        double bonus = Dara.calculateBonus(Dara.bonusInput);
        System.out.println("Bonus: " + bonus);
    }
    
}
