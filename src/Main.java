import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(3.2,5,5,6.7);
        System.out.println("\nParallelogram analysis");
        System.out.println("-------------------------");
        System.out.println("It`s a square: " + parallelogram.isSquare());
        System.out.println("It`s a rectangle: " + parallelogram.isRectangle());
        System.out.println("It`s a rhombus: " + parallelogram.isRhombus());
        System.out.println("It`s a parallelogram: " + parallelogram.isParallelogram());
        System.out.printf("Area: %.2f \n",parallelogram.getArea());
        System.out.println("Perimeter: " + parallelogram.getPerimeter());
        System.out.printf("You can place a circle with a maximum radius in it: %.2f \n",parallelogram.getCircleRadiusInscribed());
        System.out.printf("It can be placed in a circle with a minimum radius: %.2f \n", parallelogram.getCircleRadiusDescribed());
    }
}
