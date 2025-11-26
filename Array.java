import java.util.Scanner;
public class Array{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int[]myArray={3, 5, 6, 9, 3};
        for (int i =0; i<myArray.length; ++i){
            System.out.println("Enter the next integer:");
            myArray[i]=input.nextInt();
        }
    }
}