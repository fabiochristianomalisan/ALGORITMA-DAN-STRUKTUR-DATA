/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd;

/**
 *
 * @author ACER
 */
class buku {
     public String judul;
        public int jumlahHalaman;
        public double tinggiBuku;
        private String[] listBuku;
      
        public buku(String j, int jml, double tg) {
            this.judul = j;
            this.jumlahHalaman = jml;
            this.tinggiBuku = tg;
    }
    buku(DaftarBuku data, int i) {
        
    }
    
   public void tampil(){
       System.out.println("Judul = "+judul);
       System.out.println("Jumlah Halaman  = "+jumlahHalaman);
       System.out.println("Tinggi Buku = "+tinggiBuku);
       
       for (int i = 0; i < jumlahHalaman; i++) {
           System.out.print(listBuku[i] + " ");
       }
       System.out.println();
   }
   public void TamoilPosisi(int x, int pos) {
       if (pos != -1){
           System.out.println("data : "+ x +" tidak ditemukan");
       }
       else{
           System.out.println("data "+ x + " tidak ditemukan");
       }
   }
   public int binarySearch(int cari) {
       throw new UnsupportedOperationException("Not supported yet.");//To change body of generated methood
   }

    void tampil1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void TampilPosisi(int cari, int posisi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int binarySearch(int cari, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }



