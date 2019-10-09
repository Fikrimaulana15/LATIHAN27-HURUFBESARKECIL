/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan27.hurufbesarkecil;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class PBO210118074LATIHAN27HURUFBESARKECIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String huruf = scanner.next();

        String besar = huruf.toUpperCase();
        String kecil = huruf.toLowerCase();

        System.out.println();
        System.out.println("======Hasil Formating======");
        System.out.println("Huruf Besar : " + besar);
        System.out.println("Huruf kecil : " + kecil);
        System.out.println("Developed by Fikri Maulana");
    }
    
}
