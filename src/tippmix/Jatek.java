/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tippmix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 *
 * @author kyruc
 */
     enum Rendezes{
        BALRA,
        KOZEPRE,
        JOBBRA
    }

public class Jatek {

    
    
    JatekMester mester = new JatekMester();
    Jatekos dani = new Jatekos("Dani");
    Jatekos jani = new Jatekos("Jani");
    Jatekos mate = new Jatekos("Máté");
    
    ArrayList<Jatekos> listazas(){
        ArrayList<Jatekos> lista = new ArrayList<>();
        lista.add(dani);      
        lista.add(jani);      
        lista.add(mate);
    return lista;
    
//    ArrayList<Integer> listazas(){
//        ArrayList<Integer> lista = new ArrayList<>();
//        lista.add(dani.tipp);      
//        lista.add(jani.tipp);      
//        lista.add(mate.tipp);
//    return lista;
    }
    public Jatek() {
        ellenorzes(listazas(), mester.nyeroszam);
    }
    void ellenorzes(ArrayList<Jatekos> list, int nyeroszam){
        
        int fieldSize = 0;
        String intFormat = "%" + fieldSize + "d";
        String stringFormat = "%" + fieldSize + "S";
        
        
        System.out.println("A nyerőszám: " + nyeroszam);
        for (Jatekos tipp : list) {
            if (tipp.tipp == nyeroszam) {
                //System.out.printf( tipp.nev + " Tippje a " + tipp.tipp + ", ami nyert!");
                System.out.printf("%S tippje: %d nyert \t \n",tipp.nev, tipp.tipp );

            }
            else {
                System.out.printf("%S tippje: %d nem nyert \t \n",tipp.nev, tipp.tipp );
                //System.out.println(tipp.nev + " Tippje a " + tipp.tipp + ", ami nem nyert!");
            }
        }
    }
    
    void formatalas(int fieldSize){
        String intFormat = "%" + fieldSize + "d";
        String stringFormat = "%" + fieldSize + "S";
    }
    void Rendezgetes(){
        // jatek konstruktorba rendezgetest meghivni
        // swith megirasa normalisan
        int fieldSize = 0;
        String format = "%" + fieldSize + "d";
        System.out.printf(format, fieldSize);
        
        Rendezes rendezeses =Rendezes.JOBBRA ;
        switch (rendezeses){
            case BALRA:
                ellenorzes(listazas(), mester.nyeroszam);
                break;
            case KOZEPRE:
                break;
            case JOBBRA:
                break;
//            default:
//                break;
        }
    }
            
//            String beolvas() throws IOException{
//                 // Enter data using BufferReader
//        BufferedReader reader = new BufferedReader(
//            new InputStreamReader(System.in));
// 
//        // Reading data using readLine
//        String name = reader.readLine();
//            return name;
//            }
}
