public class EmployeeTester{

    public static void main (String []args){

// create object of one employee
Employee one = new Employee(3000, "Dara", "Ade" );
Employee two = new Employee(4000, "David", "Dasi");
// get the value inputed
System.out.println("This is " + one.getFirstName() + " " + one.getLastName() + " " +  "his monthly salary is " + one.getMonthlySalary());
System.out.println ("his yearly salary at first is " + one.getMonthlySalary()*12);
System.out.println (" his yearly salary after a raise is " + one.getMonthlySalary()*1.10*12);
System.out.println("This is " + two.getFirstName() + " " + two.getLastName() + " " + "his monthly salary is " + two.getMonthlySalary());
System.out.println ("his yearly salary at first is " + two.getMonthlySalary()*12);
System.out.println (" his yearly salary after a raise is " + two.getMonthlySalary()*1.10*12);


/*set the values

one.setfirstName( "Shelya");
one.setlastName("Mcguire");
two.setfirstName("Darak");
two.setlastName("Shema");
*/
one.setmonthlySalary(20000);

two.setmonthlySalary(40000);

/*return yearly salary
System.out.println (" The yearly salary is " + one.yearlySalary());
System.out.println (" The yearly salary is " + two.yearlySalary());
*/
/*see a ten percent raise
System.out.println ( " After a raise is " + one.PayRaise());
System.out.println ( " After a  raise is " + two.PayRaise());
*/






    }
}