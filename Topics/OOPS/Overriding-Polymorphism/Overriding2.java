class Shape{
    void draw(){
        System.out.println("Drawing Shape.");
    }
    void erase(){
        System.out.println("Erasing Shape.");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle.");
    }
    void erase(){
        System.out.println("Erasing Circle.");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square.");
    }
    void erase(){
        System.out.println("Erasing Square.");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle.");
    }
    void erase(){
        System.out.println("Erasing Triangle.");
    }
}

class TestShape{
    public static void main(String[] args){
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Square();
        c.draw();
        c.erase();
        s.draw();
        s.erase();
        t.draw();
        t.erase();
    }
}
