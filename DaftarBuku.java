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
class DaftarBuku {
    buku listBuku[] = new buku[5];
    public int[] data;
    int idx;
    int lenght;
    int length;
    
    void tambah(buku b) {
        if (idx < listBuku.length) {
            listBuku[idx] = b;
            idx++;
        }else {
            System.out.print("Data sudsh penuh!!");
        }
    }
    
    public void tampil1(){
        for (buku b : listBuku){
            b.tampil1();
            System.out.println("===================================================");
        }
    }
    
    
    
    public void bubbleSort(){
        for (int i = 0; i < listBuku.length - 1; i++) {
            for (int j = 1; j < listBuku.length - i; j++){
                if (listBuku[j].tinggiBuku> listBuku[j - 1].tinggiBuku){
                    buku tmp = listBuku[j];
                    listBuku[j] = listBuku[j - 1];
                    listBuku[j - 1] = tmp;
                }
            }
        }
    }
    public int binarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid =  (left + right)/2;
            if (cari == data[mid]) {
                
            }else if (data [mid] > cari){
                return binarySearch(cari, left, mid - 1);
            }else {
                return binarySearch(cari, mid + 1, right);
            }
        }
        return 0;
    }

    void tampil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
