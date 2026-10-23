
public class Main {
    public static void main(String[] args) {
        Smartphone Phone1 = new Smartphone(50.4501, 30.5234);

        Phone1.makeCall();

        double[] coords = Phone1.getCoordinates();
        System.out.println("Координати: " + coords[0] + ", " + coords[1]);
    }
}

interface GPS {
    double[] getCoordinates();
}

interface Cellular {
    void makeCall();
    void receiveCall();
}

class Smartphone implements GPS, Cellular {
    private double cordX;
    private double cordY;

    public Smartphone(double x, double y){
        cordX = x;
        cordY = y;
    }

    @Override
    public double[] getCoordinates(){
        return new double[]{cordX, cordY};
    }

    @Override
    public void makeCall(){
        System.out.println("Виконується вихідний дзвінок...");
    }

    @Override
    public void receiveCall(){
        System.out.println("Прийнято вхідний дзвінок...");
    }
}