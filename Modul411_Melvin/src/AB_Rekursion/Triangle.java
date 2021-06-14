package AB_Rekursion;
/**
 A triangular shape composed of stacked unit squares like this:
 []
 [][]
 [][][]
 ...
*/
public class Triangle
{
    private int width;

    public Triangle(int aWidth)
    {
        width = aWidth;
    }

    public static void main(String[] args){
        Triangle t = new Triangle(10);
        int area = t.getArea();
        System.out.println("Area: " + area);

        int nThTriangleNumber = 10;
        System.out.println(calculateNthTriangleNumber(nThTriangleNumber));
    }

    public int getArea()
    {
        if (width <= 0) { return 0; }
        if (width == 1) { return 1; }
        Triangle smallerTriangle = new Triangle(width - 1);
        int smallerArea = smallerTriangle.getArea();
        return smallerArea + width;
    }

    public static int calculateNthTriangleNumber(int number){
        return (number * (number + 1 ) / 2);
    }
}
