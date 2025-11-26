public class Incubator {
    public int temperature;
    // incubator object 
   public Incubator(){
    temperature=5;
   }
    public boolean increaseTemp(){
        temperature +=1;
         if ((temperature>=-10) && (temperature<10)){
             
             return true;        
    }
    else{
        System.out.println("Temperature out of range");
        return false;
        }
    }
    public boolean  decreaseTemp(){
        temperature -=1;
         if ((temperature>=-10) && (temperature<10)){
             
             return true;
    }
    else{
        System.out.println("Temperature out of range");
        return false;
        }
    }
 
    
}
