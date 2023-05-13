package az.coders.project.lesson6;

public class Rectangle {
    double width;
    double height;
    double sideLength;


    public  Rectangle(double width, double height){
        this.width=width;
        this.height=height;

    }
    public Rectangle(double sideLength){
        this(sideLength,sideLength);

    }
}

