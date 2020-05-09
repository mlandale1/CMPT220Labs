package lab05;

public class Rectangle {
    private double height;
    private double length;
    private double area;

    public Rectangle(double height, double length){
        this.height = height;
        this.length = length;
        setArea();
    }

    public double getLength(){
        return length;
    }

    public double getHeight(){
        return height;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setHeight(double height){
        this.height = height;
    }

    private void setArea(){
        this.area = this.height*this.length;
    }

    public double getArea(){
        setArea();
        return area;
    }

    @Override
    public String toString(){
        return "Rectangle(" +
                "height=" + height +
                ", length=" + length +
                ", area=" + area +
                '}';
    }
}
