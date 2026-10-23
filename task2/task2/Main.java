package task2;


public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(19.2, 19.4);
        System.out.println("X = " + point1.getX() +" | Y = " + point1.getY());
        System.out.println("...");
        point1.moveTo(10.4,14.4);
        System.out.println("X = " + point1.getX() +" | Y = " + point1.getY());
    }
}

interface Movable {
    void setX(double x);
    void setY(double y);
    double getX();
    double getY();

    void moveTo(double x, double y);
}

class Point implements Movable {
    private double x;
    private double y;

    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void setX(double x){
        this.x = x;
    }

    @Override
    public void setY(double y){
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }
}