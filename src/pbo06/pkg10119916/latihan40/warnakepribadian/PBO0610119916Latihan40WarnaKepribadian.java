/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan40.warnakepribadian;

import java.awt.Color;
import javax.swing.JLabel;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program : warna Kepribadian
 */

public class PBO0610119916Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        Warna color = new Warna();
        
        System.out.println(color.merah + "YUK " + color.hijau + "CEK " + color.kuning + "KEPRIBADIAN " + color.birumuda + "DARI " + color.ungu + "WARNA " + color.biru + "FAVORITMU" + color.normal);
        System.out.print("\n");
        System.out.println(color.bmerah + color.putih + "         MERAH        " + color.normal);
        System.out.println(color.bhijau + color.putih + "         HIJAU        " + color.normal);
        System.out.println(color.bkuning + color.putih + "         KUNING       " + color.normal);
        System.out.println(color.bbiru + color.putih + "         BIRU         " + color.normal);
        System.out.println(color.bungu + color.putih + "         UNGU         " + color.normal);
        System.out.print("\n");
        System.out.print("PILIH WARNA FAVORITMU : ");
        color.warna = input.next();
        color.warna = color.warna.toUpperCase();
        System.out.print("NAMA KAMU : ");
        color.nama = input.next();
        color.nama = color.nama.toUpperCase();
        
        System.out.print("\n");
        
        color.testWarnaKepribadian(color.warna, color.nama);
    
    }
    
}