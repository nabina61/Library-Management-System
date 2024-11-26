
interface GoemetricObject{
    public double getParameter();
    public double getArea();
}

class circle implements GoemetricObject{
    protected double radius;
    circle(double radius){
        this.radius=radius;
    }
    public double getParameter(){
      return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}

interface Resizable{
    public void resize(int percent);
}

class ResizableCircle extends circle implements Resizable {
    ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
//        radius = radius - (percent/100.0) * radius;
        radius *= (1 + percent / 100.0);

    }
}

public class Question {
    public static void main(String[] args) {
        circle c = new circle(2);
        System.out.println("before  "+c.getArea());
        System.out.println("before  "+c.getParameter());


ResizableCircle r = new ResizableCircle(2);
r.resize(50);
System.out.println("after resize,the Perimeter is "+r.getParameter());
System.out.println("after resize,The area is "+r.getArea());
    }
}
