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
public class Jatekos extends JatekMester {
    String nev;
    int tipp;

    public Jatekos(String nev) {
        this.nev = nev;
        this.tipp = sorsolas();
    }
    
}
