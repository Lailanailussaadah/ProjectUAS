/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author ASUS
 */
public class DataKaryawan {
     public String IdK,NamaK,AlamatK,TglK,GolK;
    
    private int Day,Mounth,Years;
    
    boolean StatusTunjanganA = false,StatusTunjanganK = false,StatusTunjanganP = false;
    
    public int StatusK,BanyakAnak,Usia,TunjanganK,TunjanganP,TunjanganA,GajiT,Potongan,
            GajiA ,GajiP;
    
    public DataKaryawan(String id, String nama, String alamat, String tgl, String golong, int status, int anak){
        this.IdK = id;
        this.NamaK = nama;
        this.AlamatK = alamat;
        this.TglK = tgl;
        this.GolK = golong;
        this.StatusK = status;
        this.BanyakAnak = anak;

        String Tgllahir =  this.TglK;
        String[] lahir = Tgllahir.split("-");
        Years = Integer.parseInt(lahir[0] );
        Mounth = Integer.parseInt(lahir[1] );
        Day = Integer.parseInt(lahir[2] );
        
        LocalDate from = LocalDate.of(Years, Mounth, Day);

        LocalDate today = LocalDate.now();

        int Umur = Period.between(from, today).getYears();
        this.Usia = Umur;

        switch (GolK) {
            case "a":
            case "A":
                GajiP = 5000000;
                break;
            case "b":
            case "B":
                GajiP = 6000000;
                break;
            case "c":
            case "C":
                GajiP = 7000000;
                break;
        }

        switch(StatusK ){
            case 1 : 
                this.TunjanganK = GajiP*10/100;
                this.StatusTunjanganK = true;
                break;
        }

        switch(StatusK){
            case 1 :
                if(BanyakAnak>0){
                    TunjanganA = BanyakAnak*GajiP*5/100;
                    StatusTunjanganA = true;
                }
                break;
        }

        if(Usia>30){
            TunjanganP = GajiP*15/100;
            StatusTunjanganP = true;
            
        }

        GajiT = GajiP + TunjanganK + TunjanganP + TunjanganA;

        Potongan = GajiT*25/1000;

        GajiA = GajiT - Potongan;
        
    }

    DataKaryawan(String Kode_Karyawan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void print(){
        System.out.println("=========================================================");
        System.out.println("                  DATA PROFIL KARYAWAN                   ");
        System.out.println("---------------------------------------------------------");

        System.out.println("Kode Karyawan           : " + IdK);
        System.out.println("Nama Karyawan           : " + NamaK);
        System.out.println("Golongan                : " + GolK);
        System.out.println("Usia                    : " + Usia);

        switch( StatusK ){
            case 0 :
                System.out.println("Status Menikah          : Belum Menikah");
                System.out.println("---------------------------------------------------------");
                break;
            
            case 1 :
                System.out.println("Status Menikah          : Sudah Menikah");
                System.out.println("Jumlah Anak             : " + BanyakAnak);
                System.out.println("---------------------------------------------------------");
        }
        System.out.println("Gaji Pokok              : Rp" + GajiP);

        if(StatusTunjanganA){
        String TunjanA = null;
            System.out.println("Tunjangan Anak          : Rp" + TunjanA); 
        }if(StatusTunjanganK){
            String TunjanK = null;
            System.out.println("Tunjangan Suami/Istri   : Rp" + TunjanK );
        }if(StatusTunjanganP){
            String TunjanP = null;
            System.out.println("Tunjangan Pegawai       : Rp" + TunjanP); 
        }
        System.out.println("--------------------------------------------------------- +");
        System.out.println("Gaji Kotor              : Rp" + GajiT);
        System.out.println("Potongan                : Rp" + Potongan);
        System.out.println("--------------------------------------------------------- -");
        System.out.println("Gaji Bersih             : Rp" + GajiA);
    }
}
