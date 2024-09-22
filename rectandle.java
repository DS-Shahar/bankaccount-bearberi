public class Rectangle {
    private double length;
    private double width;
	
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void draw() {
        System.out.printf(length, width);
    }

    public double calcArea() {
        return length * width;
    }

    public double calcPerimeter() {
        return 2 * (length + width);
    }

    public void scale(int factor) {
        length = length * factor;
        width = width * factor;
    }

    public String toString() {
        return String.format("רוחב ואורך המלבן הם: ", length, width);
    }
	
	
	
	
    length1 = int(input("הכנס את אורך המלבן הראשון: "));
    width1 = int(input("הכנס את רוחב המלבן הראשון: "));
    length2 = int(input("הכנס את אורך המלבן השני: "));
    width2 = int(input("הכנס את רוחב המלבן השני: "));

    rect1 = Rectangle(length1, width1);
    rect2 = Rectangle(length2, width2);

    print("מלבן 1:");
    rect1.draw();
    print("מלבן 2:");
    rect2.draw();


    rect1.scale(2);
    rect1.draw();

    total_perimeter = rect1.calcPerimeter() + rect2.calcPerimeter();
    total_area = rect1.calcArea() + rect2.calcArea();

    # הצגת תוצאות
    print(f"סכום ההיקפיה של שני המלבנים הוא:" + total_perimeter );
    print(f"סכום ההיקפיה של שני המלבנים הוא: " + total_area);


    print(rect1.toString());

