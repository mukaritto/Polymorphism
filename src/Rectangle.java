public class Rectangle extends GeometricFigure{
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void perimeter() {
        System.out.println((sideA+sideB)*2);
    }

    @Override
    public void area() {
        System.out.println(sideA*sideB);
    }
}
