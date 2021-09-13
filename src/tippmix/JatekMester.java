/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tippmix;

/**
 *
 * @author kyruc
 */
public class JatekMester {
    int nyeroszam; 
    int sorsolas() {
        int max = 9;
        int min = 1;
        int range = (max - min) + 1;
        return (int) (Math.random()* range) + min;
}

    public JatekMester() {
        this.nyeroszam = sorsolas();
    }
    
}
