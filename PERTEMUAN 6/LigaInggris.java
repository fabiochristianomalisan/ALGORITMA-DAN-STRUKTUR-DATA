/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg6;

/**
 *Nama      :Fabio Christiano Malisan
 * Kelas    :TI / 1F
 * NIM      :1941720202
 * @author ACER
 */
public class LigaInggris {
    String namaKlub;
    int permainan;
    int agregat;
    int poin;
    
    LigaInggris (String nama, int p, int gd, int pts) {
        namaKlub = nama;
        permainan = p;
        agregat = gd;
        poin = pts;
    }
    
    void tampil() {
        System.out.println("============================================");
        System.out.println("Nama Klub : "+namaKlub);
        System.out.println("Jumlah Permainan : "+permainan);
        System.out.println("Jumlah Agregat : "+agregat);
        System.out.println("Poin yang didapat : "+poin);
        
    }
}

