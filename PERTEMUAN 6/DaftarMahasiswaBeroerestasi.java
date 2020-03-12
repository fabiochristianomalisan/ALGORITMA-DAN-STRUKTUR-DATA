/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author ACER
 */
public class DaftarMahasiswaBeroerestasi {
    Mahasiswa ListMhs[] = new Mahasiswa[5];
    int idx;
    
   void tambah(Mahasiswa m){
       if(idx<ListMhs.length){
           ListMhs[idx] = m;
           idx++;
       }else{
           System.out.println("Data sudah penuh!!");
       }
   }
   void tampil(){
       for(Mahasiswa m : ListMhs){
           m.tampil();
           System.out.println("------------------------");
       }
   }
   void bubblesort(){
       for(int i=0; i<ListMhs.length-1; i++){
           for(int j=1; j<ListMhs.length-i; j++){
               if(ListMhs[j].ipk > ListMhs[j-1].ipk){
                   //ddibawah ini proses awap atau penukaran
                   Mahasiswa tmp = ListMhs[j];
                   ListMhs[j] = ListMhs[j];
                   ListMhs[j-1] = tmp;
               }
           }
       }
   }
}
