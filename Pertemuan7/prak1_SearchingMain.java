/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg7;

/**
 *
 * @author ACER
 */
public class prak1_SearchingMain {
   
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        
    prak1_searching pencarian = new prak1_searching (data, 8);
    System.out.println (" ISI ARRAY ");
    pencarian.TampilData();
    
    int cari = 30;
        
        System.out.println("Sequential search");
        int posisi=pencarian.FindSeqSearch(cari);
        if(posisi!= -1){
            System.out.println("Data : " + cari + " ditemukan pada indeks " + posisi );
            
        }else{
            System.out.println("Data " + cari + "tidak ditemukan");
        }
    }
}


