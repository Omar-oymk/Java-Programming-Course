package Question_11;

class Triangle extends GeometricObject
{
    private double side1 = 1.0f;
    private double side2 = 1.0f;
    private double side3 = 1.0f;

    public Triangle() {}
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() { return 0.5 * side1 * side2; }
    public double getPerimeter() { return side1 + side2 + side3; }

    public String toString()
    {
        return "Area = " + getArea() + "\nPerimeter = " + getPerimeter();
    }
}
