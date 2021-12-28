/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import java.util.Scanner;
import javafx.scene.chart.PieChart;

/**
 *
 * @author ASUS
 */
public class Karyawan {

    int jumlahAnak;
    String kodeKaryawan;
    String namaKaryawan;
    String golonganKaryawan;
    int usia;
    int statusKaryawan;


    public Karyawan(String kode, String nama, String alamat, String tanggal, String golongan, int status, int anak) {
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KaryawanData data = new KaryawanData() {
            @Override
            public void add(PieChart.Data data) {
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

            @Override
            public void TambahData(Karyawan karyawan) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void HapusData(String kode) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void CariData(String kode) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void LihatData() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
//        boolean menu = true;
        while (true){
            System.out.println("\n========= MENU ========");
            System.out.println("[1] Tambah Data");
            System.out.println("[2] Hapus Data");
            System.out.println("[3] Cari Data");
            System.out.println("[4] Lihat Data");
            System.out.println("[5] Exit");
            
            Scanner input = new Scanner(System.in);
            System.out.print("Menu Pilihan: ");
            System.out.print("");
            int selectedMenu = input.nextInt();
            
            switch(selectedMenu){
                case 1:
                    boolean tambahData = true;
                    while(tambahData){
                        String debug = input.nextLine();
                        System.out.print("\nMasukkan Kode Karyawan    : ");
                        String kode = input.nextLine();
                        System.out.print("Masukkan Nama Karyawan    : ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan Alamat Karyawan  : ");
                        String alamat = input.nextLine();
                        System.out.print("Masukkan Tanggal Lahir    : ");
                        String tanggal = input.nextLine();
                        System.out.print("Masukkan Golongan         : ");
                        String golongan = input.nextLine();
                        System.out.print("Masukkan Status Menikah   : ");
                        int status = input.nextInt();
                        int anak;
                        if (status == 1){
                            System.out.print("Jumlah anak               : ");
                            anak = input.nextInt();
                        }else{
                            anak = 0;
                        }
                        
                        Karyawan karyawan = new Karyawan(kode, nama, alamat, tanggal, golongan, status, anak);
                        
                        data.TambahData(karyawan);
                        
                        System.out.println("\nPilih SubMenu:");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Tambah Data Kembali");
                        System.out.print("Menu Pilihan: ");
                        int pilih =input.nextInt();
                        if(pilih == 1){
                            tambahData = false;
                        } else if(pilih != 2){
                            System.out.println("Pilihan Menu salah");
                        }
                    }
                    break;
                
                case 2:
                    boolean hapusData = true;
                    while(hapusData){
                        String debug = input.nextLine();
                        System.out.print("\nMasukkan Kode Karyawan: ");
                        String kode = input.nextLine();
                        data.HapusData(kode);
                        
                        System.out.println("\nPilih SubMenu:");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Hapus Data Kembali");
                        System.out.print("Menu Pilihan: ");
                        int pilih =input.nextInt();
                        if(pilih == 1){
                            hapusData = false;
                        } else if(pilih != 2){
                            System.out.println("Pilihan Menu salah");
                        }
                    }
                    break;
                    
                case 3:
                    boolean cariData = true;
                    while(cariData){
                        String debug = input.nextLine();
                        System.out.print("\nMasukkan Kode Karyawan : ");
                        String kode = input.nextLine();
                        data.CariData(kode);
                        
                        System.out.println("\nPilih SubMenu:");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.print("Menu Pilihan: ");
                        int pilih =input.nextInt();
                        if(pilih == 1){
                            cariData = false;
                        } else{
                            System.out.println("Pilihan Menu salah");
                        }
                    }
                    break;
                
                case 4:
                    boolean lihatData = true;
                    while(lihatData){
                        data.LihatData();
                        
                        System.out.println("\nPilih SubMenu:");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.print("Menu Pilihan: ");
                        int pilih =input.nextInt();
                        if(pilih == 1){
                            lihatData = false;
                        } else if(pilih != 2){
                            System.out.println("Pilihan Menu salah");
                        }
                    }
                    break;
                
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        }
    }

    void cetak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
