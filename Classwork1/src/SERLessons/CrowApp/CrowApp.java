package SERLessons.CrowApp;

import java.awt.*;

/**
 * Vishal Nigam
 * 1/30/18
 */
public class CrowApp {
    private Crow _goodCrow;
    public CrowApp(){
        _goodCrow = new Crow();
        _goodCrow.fly();
        java.awt.Color c = Color.WHITE;
    }
    public static void main(String[]args){
        CrowApp app = new CrowApp();
    }
}
