abstract class TwoDShape {
    private double width;
    private double height;
    private String name;
    
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }
    
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    
    // Объект с одинаковыми значениями width и height
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }
    
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    
    String getName() { return name; }
    
    abstract double area();
}

//Подкласс для представления треугольников
class Triangle extends TwoDShape {
    private String style;
    
    Triangle() {
        super();
        style = "none";
    }
    
    Triangle(String s, double w, double h) {
        super(w, h, "треугольник");
        
        style = s;
    }
    
    // Создать треугольник
    Triangle(double x) {
        super(x, "треугольник");
        
        style = "закрашенный";
    }
    
    // Создать объект на основе другого
    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }
    
    double area() {
        return getWidth() * getHeight() / 2;
    }
    
    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

//Подкласс для представления прямоугольников
class Rectangle extends TwoDShape {
    
    Rectangle() {
        super();
    }
    
    Rectangle(double w, double h) {
        super(w, h, "прямоугольник");
    }
    
     // Создать квадрат
    Rectangle(double x) {
        super(x, "прямоугольник");
    }
    
    // Создать объект на основе другого
    Rectangle(Rectangle ob) {
        super(ob);
    }
    
    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }
    
    double area() {
        return getWidth() * getHeight();
    }
}

class Circle extends TwoDShape {
    
    Circle() {
        super();
    }
    
    Circle(double x) {
        super(x, "круг");
    }
    
    Circle(Circle ob) {
        super(ob);
    }
    
    double area() {
        return Math.PI * Math.pow(getWidth()/2, 2);
    }
}
    
class Shapes {
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[5];
        Triangle sh = new Triangle(10.0);
        Rectangle sq = new Rectangle(10);

        shapes[0] = new Triangle("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new Circle(6.0);
        
        for(int i=0; i<shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();
        }
        sh.showStyle();
        if(sq.isSquare() == true) System.out.println("True");
    }
}