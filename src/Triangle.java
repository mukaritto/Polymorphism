

public class Triangle extends GeometricFigure{
    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void area() {
        int s = (sideA+sideB+sideC)/2;
        int res = s*(s-sideA)*(s-sideB)*(s-sideC);
        System.out.println(Math.sqrt(res));
    }

    @Override
    public void perimeter() {
        System.out.println(sideA+sideB+sideC);
    }
}
