import java.util.Objects;

class Parallelogram {

    private double length;
    private double width;
    private double diagonal1;
    private double diagonal2;

    public Parallelogram(){}

    public Parallelogram(double length, double width, double diagonal1, double diagonal2){
        this.length = length;
        this.width = width;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setDiagonal1(double diagonal1){
        this.diagonal1 = diagonal1;
    }
    public void setDiagonal2(double diagonal2){
        this.diagonal2 = diagonal2;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getDiagonal1() {
        return diagonal1;
    }
    public double getDiagonal2() {
        return diagonal2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return Double.compare(that.length, length) == 0 &&
                Double.compare(that.width, width) == 0 &&
                Double.compare(that.diagonal1, diagonal1) == 0 &&
                Double.compare(that.diagonal2, diagonal2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, diagonal1, diagonal2);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "length=" + length +
                ", width=" + width +
                ", diagonal1=" + diagonal1 +
                ", diagonal2=" + diagonal2 +
                '}';
    }

    boolean isSquare(){
        if(diagonal1 == diagonal2 && length == width){ return true;}
        else {return false;}
    }

    boolean isRectangle(){
        if(diagonal1 == diagonal2 && length != width){ return true;}
        else {return false;}
    }

    boolean isRhombus(){
        if(diagonal1 != diagonal2 && length == width){ return true;}
        else {return false;}
    }

    boolean isParallelogram(){
        if(isSquare()==false && isRectangle()== false && isRhombus()==false){ return true;}
        else {return false;}
    }

    double getArea(){
        double p = (length + width + diagonal1)/2;
        double a = p*(p-length)*(p-width)*(p-diagonal1);
        return Math.sqrt(a)*2;
    }

    double getPerimeter(){
        return (width + length)*2;
    }

    double getCircleRadiusInscribed(){
        return (this.getArea()/length)/2;
    }

    double getCircleRadiusDescribed(){
        if(diagonal1>diagonal2){return diagonal1/2;}
        else{return diagonal2/2;}
    }
}

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
