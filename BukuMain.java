/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class BukuMain {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);
        DaftarBuku data = new DaftarBuku();
        int jumBuku = 4;
        buku pencarian = new buku(data, 8);
        System.out.println("isi Array : ");
        pencarian.tampil();
        
        for (int i = 0; i < jumBuku; i++) {
            System.out.print("Judul = ");
            String judul = s1.nextLine();
            System.out.print("Jumlah halaman = ");
            int jmlHal = s.nextInt();
            System.out.print("Tinggi Buku = ");
            int tgBuku = s.nextInt();
            
            buku m = new buku(judul, jmlHal, tgBuku);
            data.tambah(m);
            
            
            
        }
        
        System.out.println("Data buku sebelum sorting");
        data.tampil();
        System.out.println("Data buku setelah diurutkan : ");
        data.tampil();
        System.out.print("Judul yang ingin dicari : ");
        int cari = s1.nextInt();
        int posisi = pencarian.binarySearch(cari);
        
        pencarian.TampilPosisi(cari, posisi);
        System.out.println("=============================================");
        System.out.println("menggunakan binary search");
        posisi = pencarian.binarySearch(cari, 0, data.length - 1);
        pencarian.TampilPosisi(cari, posisi);
        
    }
}
