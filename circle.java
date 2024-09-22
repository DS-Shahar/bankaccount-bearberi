public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(4.0);
        Circle circle2 = new Circle(5.0);


        System.out.println("השטח של מעגל 1 הוא: ", circle1.area());
        System.out.println("השטח של מעגל 2 הוא: ", circle2.area());
    }
}
