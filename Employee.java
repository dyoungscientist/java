public class Employee {

    private String firstName;
    private String lastName;
    private int monthlySalary;


public Employee(int mSalary, String last, String first){
    if (monthlySalary < 0 ){
        monthlySalary=0;
    } 
    else{
        monthlySalary=mSalary;
   }
       lastName= last;
       firstName= first;
    }


 public void setfirstName(String first){
            firstName = first;
    }
public void setlastName(String last){
            lastName = last;
    }
public void setmonthlySalary(int mSalary){
    if (monthlySalary < 0 ){
        monthlySalary=0;
    } 
    else{
        monthlySalary=mSalary;
   }
    }

 public String getFirstName(){
        return firstName;
    }
public String getLastName(){
        return lastName;
    }
public int getMonthlySalary(){
 return monthlySalary;                                                                                                                    
}
}
