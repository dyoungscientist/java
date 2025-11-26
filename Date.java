
public class Date {
    public int day;
    public int month;
    public int year;
    // create a constructor
    public  Date (int M, int D, int Y){
        day= D;
        year = Y;
        if ((M>0) && (M<=12)){ 
            month = M;
        }
        else {
                month = 1;
        }
       
    }
     public void displayDate(){
        System.out.println("Today's date is : " + day + "/" + month +"/"+year);


        }
public static void main(String[] args) {
    Date input = new Date(0, 0, 0);
    input.day=(2);
    input.month=(12);
    input.year=(11);
    System.out.println("Today's date is : " + input.day + "/" + input.month +"/"+input.year);

}

    
}
