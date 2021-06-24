package CSCLessons.Queues;

/**
 * Vishal Nigam
 * 5/1/18
 */
public class BarberShop {
    private Arrival arr;
    public void setup(){
        arr = new Arrival();
        System.out.println("Chairs are empty.");
        arr.readArrivals("Classwork1/BarberShop.txt");
        arr.chairs();
        arr.process();
    }
    public BarberShop(){
        setup();
    }
    public static void main(String[]args){
        new BarberShop();
    }
}
