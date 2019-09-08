abstract class Shape{
    abstract float getArea();
    abstract float getCircumference();
}
class Circle extends Shape{
    final float PI = 3.14f;
    float radius;
    Circle(float radius){
        this.radius = radius;
    }
    float getArea(){
        return PI*radius*radius;
    }
    float getCircumference(){
        return 2*PI*radius;
    }
}
class Cylinder extends Circle{
    float height;
    Cylinder(float radius, float height){
        super(radius);
        this.height = height;
    }
    float getArea(){
        return super.getCircumference()*height + 2*super.getArea();
    }
}
class Inheritance{
    public static void main(String args[]){
        Circle ci = new Circle(5.0f);
        System.out.println("The area of circle is " + ci.getArea());
        Cylinder cy = new Cylinder(1.0f, 3.0f);
        System.out.println("The area of Cylinder is " + cy.getArea());
    }

}