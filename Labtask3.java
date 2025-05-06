interface draw{
    void draw();
}
interface shap extends draw{
    void shapetype();
    void calculatearea();
}
class rectangle implements shap{
    int lenght;
    int width;
    rectangle(int lenght, int width){
        this.lenght=lenght;
        this.width=width;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");

    }

    @Override
    public void shapetype() {
        System.out.println("Shape Type Rectangle.");

    }

    @Override
    public void calculatearea() {
        int area =lenght*width;
        System.out.println("Area of Rectangle:"+ area);
    }
}
class circle implements shap{
    double radius;
    circle(double radius){
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");

    }

    @Override
    public void shapetype() {
        System.out.println("Shape Type Circle.");

    }

    @Override
    public void calculatearea() {
        double area = 3.14*radius*radius;
        System.out.println("Area of Circle:"+ area);

    }
}
class square implements shap{
    int lenght;
    int width;
    square(int lenght, int width){
        this.lenght=lenght;
        this.width=width;
    }
    @Override
    public void draw() {
        System.out.println("Draw Square.");

    }

    @Override
    public void shapetype() {
        System.out.println("Shape Type:  Square.");

    }

    @Override
    public void calculatearea() {
        int area = (lenght*width);
        System.out.println("Area of Square:"+ area);

    }
}


public class Labtask3 {
    public static void main(String [] args){
        System.out.println("Details of Rectangle:");
        shap obj1 = new rectangle(23,25);
        obj1.draw();
        obj1.shapetype();
        obj1.calculatearea();
        System.out.println("Details of Circle:");

        shap obj2 = new circle(3.3);
        obj2.draw();
        obj2.shapetype();
        obj2.calculatearea();
        System.out.println("Details of Square:");

        shap obj3 = new square(3,2);
        obj3.draw();
        obj3.shapetype();
        obj3.calculatearea();
    }
}
