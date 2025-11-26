public class DriverMain2 {
    public static void main(String[] args) {
        Rectangle3 a = new Rectangle3();
        a.setlength(3);
        a.setbreadth(4);
        a.getLength();
        a.getBreadth();
        a.area();

        System.out.println( "Length: " + a.getLength());
        System.out.println("Area: " + a.area());

    }
}
// keep your data private your method public