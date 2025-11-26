public class Sensor{
    // keep track of the pressure sensor
    //two constructir methods
   private  int pressure;
    public Sensor(){
        pressure =0;
    }
    public Sensor(int p){
        pressure = p;
    }

    public boolean setPressure(int p){
        if (pressure > 0){
            pressure = p;
            return true;
        }
        else{
            return false;
        }

    }

    
}
