package lab05;

public class Circle {

    private double radius;
    private double area;

    public Circle(double radius){
        this.radius = radius;
        setArea();
    }

    public double getRaidus(){
        return radius;

    }

    public double getArea(){
        setArea();
        return area;
    }

    public void setRaidus(double radius){
        this.radius = radius;
    }

    private void setArea(){
        this.area = Math.PI*this.radius;
    }
    @Override
    public String toString(){
        return "Circle{" +
                "raidus=" + radius +
                ", area=" + area +
                '}';
    }
}
