public class Rectangle3 {
   
    private double length;
    private double breadth;

    public double area(){
        return length * breadth;
    }
    public double perimeter(){
            double perm = 2 * (length + breadth);
            return perm;
    
    }
    // setters (use double to match fields)
    public void setlength(double l){
            length = l;
    }

    public void setbreadth(double b){
        breadth = b;
    }

    // getters
    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }
}
