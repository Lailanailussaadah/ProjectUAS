/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import java.util.ArrayList;
import javafx.scene.chart.PieChart.Data;


public class KaryawanDataImpl implements KaryawanData {
    ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
    
    
    @Override
    public void TambahData(Karyawan dataKrywn) {
        this.dataKaryawan.add(dataKrywn);
    }

    boolean hapus = false;
    @Override
    public void HapusData(String kodeKaryawan) {
        for(int i=0; i<this.dataKaryawan.size(); i++){
            if(this.dataKaryawan.get(i).kodeKaryawan.equals(kodeKaryawan)){
                this.dataKaryawan.remove(i);
                hapus = true;
            }
        }
    }
    
    boolean cari = false;
    int index = 0;
    @Override
    public void CariData(String kode) {
        for(int i=0; i<this.dataKaryawan.size(); i++){
            if(this.dataKaryawan.get(i).kodeKaryawan.equals(kode)){
                index = i;
                cari = true;
            }
        }
        if(cari){
            this.dataKaryawan.get(index).cetak();
        }
    }

    @Override
    public void LihatData() {
        System.out.println("\n===================================");
        System.out.println("DATA KARYAWAN");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.format("%1$-18s%2$-20s%3$-8s%4$-8s%5$-16s%6$-16s\n","KODE KARYAWAN", "NAMA KARYAWAN", "GOL", "USIA", "STATUS NIKAH", "JUMLAH ANAK");
        System.out.println("-----------------------------------------------------------------------------------");
        
        for(int i=0; i<this.dataKaryawan.size(); i++){
            String KodeKaryawan = this.dataKaryawan.get(i).kodeKaryawan;
            String NamaKaryawan = this.dataKaryawan.get(i).namaKaryawan;
            String Golongan = this.dataKaryawan.get(i).golonganKaryawan;
            int usia = this.dataKaryawan.get(i).usia;
            String StatusKaryawan = "Belum Menikah";
            int jmlAnak = 0;
            if(this.dataKaryawan.get(i).statusKaryawan == 0){
                StatusKaryawan = "Belum Menikah";
                jmlAnak = 0;
            } else{
                StatusKaryawan = "Sudah Menikah";
                jmlAnak = this.dataKaryawan.get(i).jumlahAnak;
            }
            System.out.format("%1$-18s%2$-20s%3$-8s%4$-8s%5$-16s%6$-16s", KodeKaryawan, NamaKaryawan, Golongan, usia, StatusKaryawan, jmlAnak);
            System.out.println("");
            
        }
        
        System.out.println("-----------------------------------------------------------------------------------"); 
        System.out.println("Jumlah Data: " + this.dataKaryawan.size());
    }

    @Override
    public void add(Data data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String idk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void search(String idk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
