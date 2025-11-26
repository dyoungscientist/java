public class Rectangle {
    
    public double length;
    public double breadth;

    public double area(){// class members $ methods therefore they use each other
        double Ar = length * breadth; 
        return Ar;
    }
    public double perimeter(){
            double perm = 2 * (length + breadth);
            return perm;
    }
    };

