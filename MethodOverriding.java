class Shape{
    void draw(){
        System.out.println("cant say shape type");
    }
}
class Rectangle extends Shape{
    void draw(){
        super.draw();
        System.out.println("shape is rectangle");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        r.draw();
    }
}