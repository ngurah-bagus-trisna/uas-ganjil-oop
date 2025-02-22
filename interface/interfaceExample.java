interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Lingkaran");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Kotak");
    }
}

public class interfaceExample {
    public static void main(String[] args) {
        Shape myCircle = new Circle();
        Shape mySquare = new Square();
        
        myCircle.draw();
        mySquare.draw();
    }
}
