/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan5.kambingglobal;


public class PBO210116058Latihan5Kambingglobal {
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
           System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5 ;
        System.out.println("Jumlah Kambing Setelah ditambah: "+
                            jumlahKambing);
    }
    public static void main(String[] args) {
        PBO210116058Latihan5Kambingglobal kambingSusu = new 
        PBO210116058Latihan5Kambingglobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing(); 
        
        
    }
    
}