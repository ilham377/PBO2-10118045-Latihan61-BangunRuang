/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan61bangunruang;

/**
 *
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : Program Bangun Ruang
 */
public class PBO10118045Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola = new Bola();
        bola.setR(7);
        System.out.printf("Volume Bola = %.1f", bola.hitungVolume());
        System.out.println(" cm\u00B3");
        
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.printf("Volume Tabung = %.1f", tabung.hitungVolume());
        System.out.println(" cm\u00B3");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.printf("Volume Kerucut = %.1f", kerucut.hitungVolume());
        System.out.println(" cm\u00B3");
    }
    
}
