package Methode_Overriding;

class Shape{
    void Draw(){
        System.out.println("In Shape");
    }
}
class Circle extends Shape {
    void Draw(){
        System.out.println("Drawing Circle");
    }
}
class Square extends Shape {
    void Draw(){
        System.out.println("Drawing Square");
    }
}

public class Shape_Circle_Square {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.Draw();
    }
}
