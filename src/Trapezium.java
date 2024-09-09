public class Trapezium extends GeometricFigure{
    int sideA;
    int sideB;
    int high;

    public Trapezium(int sideA, int sideB, int high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    public void area() {
        System.out.println(((sideA+sideB)/2)*high);
    }

    @Override
    public void perimeter() {
        System.out.println(sideA+sideB+high);
    }
}
