/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tippmix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
