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
import tippmix.ListaTarolo;


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
    ArrayList<Jatekos> jatekosok;
    int nyeroszam;
    
   
    public Jatek() throws IOException {
        JatekMester mester = new JatekMester();
        jatekosLetrehoz();
        jatekosok = tippmix.ListaTarolo.JatekosokTarolo;
        nyeroszam = mester.nyeroszam;
        ellenorzes(jatekosok);
    }
    
    public void jatekosLetrehoz() throws IOException{
         BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
         System.out.println("Adja meg hány játékos fog játszani: ");
        String jatekosSzam = reader.readLine();
        
        for (int i = 0; i < Integer.parseInt(jatekosSzam); i++) {
            System.out.println("Kérem adjon meg egy nevet: ");
            String name = reader.readLine();
            Jatekos jatekos = new Jatekos(name);
            tippmix.ListaTarolo.JatekosokTarolo.add(jatekos);
        }   
    }
    
    
    void ellenorzes(ArrayList<Jatekos> list) throws IOException{
        
        int fieldSize = 0;
        String intFormat = "%" + fieldSize + "d";
        String stringFormat = "%" + fieldSize + "S";
        
        System.out.println("A nyerőszám: " + nyeroszam);
        rendezgetes(list);
    }
    
    void formatalas(String nev,int tipp, int intSize, int stringSize){
        String intFormat = "%" + intSize + "d";
        String stringFormat = "%" + stringSize + "S";
        //System.out.printf("%s tippje: %d %s \n",nev,tipp, (tipp==nyeroszam? "NYERT!" : "NEM NYERT!") );
        System.out.printf(stringFormat+" tippje:" + intFormat+ " %s \n",nev,tipp, (tipp==nyeroszam? "NYERT!" : "NEM NYERT!") );
    }
    
    void rendezgetes(ArrayList<Jatekos> list) throws IOException{
        
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
         System.out.println("JOBBRA/BALRA/KOZEPRE (válasszon a felsoroltak közül, csak nagy betűkkel írd be):" );
        String szovegRendez = reader.readLine();
        
        switch (szovegRendez){
            case "BALRA":
                System.out.println("\nBalra\n");
                Rendezes rendezeses =Rendezes.BALRA ;
                for (Jatekos tipp : list) {
                    //System.out.printf("%s tippje: %d %s \n",tipp.nev,tipp.tipp, (tipp.tipp==nyeroszam? "NYERT!" : "NEM NYERT!") );
                    formatalas(tipp.nev,tipp.tipp,5,6);
                }
                break;
            case "KOZEPRE":
                System.out.println("\nKözépre\n");
                rendezeses =Rendezes.KOZEPRE ;
                for (Jatekos tipp : list) {
                    //System.out.printf("%15s tippje: %15d %15s \n",tipp.nev,tipp.tipp, (tipp.tipp==nyeroszam? "NYERT!" : "NEM NYERT!") );
                    formatalas(tipp.nev,tipp.tipp,5,25);
                    }
                break;
            case "JOBBRA":
                System.out.println("\nJobbra\n");
                rendezeses =Rendezes.JOBBRA ;
                for (Jatekos tipp : list) {
                    //System.out.printf("%30s tippje: %30d %30s \n",tipp.nev,tipp.tipp, (tipp.tipp==nyeroszam? "NYERT!" : "NEM NYERT!") );
                    formatalas(tipp.nev,tipp.tipp,5,50);
                }
                break;
        } 
    }    
}
