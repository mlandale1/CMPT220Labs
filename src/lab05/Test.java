package lab05;

public class Test {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(10, 15);
        Rectangle rect2 = new Rectangle(35, 60);
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(50);

        //prints shapes out
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(circle1);
        System.out.println(circle2);

        //prints area
        System.out.println("\nCircle 1 area before the radius change: " + circle1.getArea());
        System.out.println("Rectangle 1 area before the height change: " + rect1.getArea());

        //changes the height of the rectangle and of the circle
        circle1.setRaidus(10);
        rect1.setHeight(20);

        //prints after changes
        System.out.println("\nCircle 1 area after radius change: " + circle1.getArea());
        System.out.println("Rectangle 1 area height change: " + rect1.getArea());
    }
}
