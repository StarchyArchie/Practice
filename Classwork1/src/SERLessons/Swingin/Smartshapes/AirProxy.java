package SERLessons.Swingin.Smartshapes;

/**
 * Vishal Nigam
 * 4/14/18
 */
public class AirProxy {
    Aircraft air;
    AirProxy(Aircraft a){
        setAir(a);
    }
    public Aircraft getAir(){
        return air;
    }
    public void setAir(Aircraft a){
        air = a;
    }
}
