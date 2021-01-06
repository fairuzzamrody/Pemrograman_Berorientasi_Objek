/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import tubespbo.Application;
import tubespbo.Dokter;
import tubespbo.Kelas;
import tubespbo.PasienInap;
import tubespbo.Pasien;
import tubespbo.Ruangan;


/**
 *
 * @author Fairuz Zamrody (19051397056)
 */
public class ViewConsole {

    private Application app;
    private Scanner s1 = new Scanner(System.in);
    private Scanner s2 = new Scanner(System.in);

    public ViewConsole(Application app) {
        this.app = app;
    }
    public void MainMenu() {
        int pil1 = 0;
        int pil2 = 0;
        while (pil1 != 5) {
            System.out.println();
            System.out.println("1. Data Dokter");
            System.out.println("2. Data Pasien");
            System.out.println("3. Data Ruangan");
            System.out.println("4. Data Kelas");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Pilih Menu : ");
            pil1 = s1.nextInt();
            switch (pil1) {
                case 1:
                    pil2 = 0;
                    while(pil2 != 4){
                    System.out.println();
                    System.out.println("-Data Dokter-");
                    System.out.println("1.Insert Dokter");
                    System.out.println("2.Search Dokter");
                    System.out.println("3.Delete Dokter");
                    System.out.println("4.Kembali");
                    System.out.println("Pilih :");
                    pil2 = s1.nextInt();
                    switch(pil2){
                        case 1:
                            System.out.println();
                            System.out.print("Masukkan Nama : ");
                            String namadok = s2.nextLine();
                            System.out.print("Masukkan Umur : ");
                            int umurdok = s1.nextInt();
                            System.out.print("Masukkan Jenis Kelamin : ");
                            String jenisKelamindok = s2.nextLine();
                            System.out.print("Masukkan Alamat : ");
                            String alamatdok = s2.nextLine();
                            System.out.print("Masukkan No SIP : ");
                            int noSip = s1.nextInt();
                            System.out.print("Masukkan Spesialis : ");
                            String spesialis = s2.nextLine();
                            app.insertDokter(namadok, umurdok, jenisKelamindok, alamatdok, noSip, spesialis);
                            break;
                        
                        case 2:
                            System.out.println();
                            System.out.print("Masukkan Index Dokter : ");
                            int id = s1.nextInt();
                            Dokter e = app.getDokter(id);
                            if (e != null) {
                                System.out.println("Nama = " + e.getNama());
                                System.out.println("Umur = " + e.getUmur());
                                System.out.println("Jenis Kelamin = " + e.getJenisKelamin());
                                System.out.println("Alamat = " + e.getAlamat());
                                System.out.println("NO SIP = " + e.getNoSip());
                                System.out.println("Spesialis = " + e.getSpesialis());
                            } 
                            else {
                                System.out.println("Data Tidak Ditemukan");
                            }
                            break;
                         
                        case 3:
                            System.out.println();
                            System.out.print("Masukkan Indeks Dokter : ");
                            int j = s1.nextInt();
                            Dokter f = app.getDokter(j);
                            if (f != null) 
                            {
                                app.deleteDokter(j);
                                System.out.println("Data Dokter Berhasil Dihapus");
                            }
                            else {
                                System.out.println("Data Tidak Ditemukan");
                            }
                            break;
                        
                        case 4:
                            break;
                    
                    }
                    }
                    break;
                case 2:
                    pil2 = 0;
                    while(pil2 != 4){
                    System.out.println();
                    System.out.println("-Data Pasien-");
                    System.out.println("1.Insert Pasien");
                    System.out.println("2.Search Pasien");
                    System.out.println("3.Delete Pasien");
                    System.out.println("4.Kembali");
                    System.out.println("Pilih :");
                    pil2 = s1.nextInt();
                    switch(pil2){
                        case 1:
                            System.out.print("Masukkan Nama : ");
                            String namapas = s2.nextLine();
                            System.out.print("Masukkan Umur : ");
                            int umurpas = s1.nextInt();
                            System.out.print("Masukkan Jenis Kelamin : ");
                            String jenisKelaminpas = s2.nextLine();
                            System.out.print("Masukkan Alamat : ");
                            String alamatpas = s2.nextLine();
                            System.out.print("Masukkan ID Pasien : ");
                            int idpasien = s1.nextInt();
                            System.out.print("Masukkan Tanggal Daftar : ");
                            String tgldaftar = s2.nextLine();
                            System.out.print("Masukkan Golongan Darah : ");
                            String goldarah = s2.nextLine();
                            app.insertPasien(namapas,umurpas,jenisKelaminpas,alamatpas,idpasien,tgldaftar,goldarah);
                            break; 
                        
                        case 2:
                            System.out.println();
                            System.out.print("Masukkan Index Pasien : ");
                            int idpas = s1.nextInt();
                            Pasien pas = app.getPasien(idpas);
                            if (pas != null) 
                            {
                                System.out.println("Nama = " + pas.getNama());
                                System.out.println("Umur = " + pas.getUmur());
                                System.out.println("Jenis Kelamin = " + pas.getJenisKelamin());
                                System.out.println("Alamat = " + pas.getAlamat());
                                System.out.println("ID Pasien = " + pas.getIdPasien());
                                System.out.println("Tanggal Daftar = " + pas.getTglDaftar());
                                System.out.println("Golongan Darah = " + pas.getGolDarah());
                            } 
                            else 
                            {
                                System.out.println("Data Tidak Ditemukan");
                            }
                            break;
                         
                        case 3:
                            System.out.println();
                            System.out.print("Masukkan Indeks Dokter : ");
                            int j = s1.nextInt();
                            Dokter f = app.getDokter(j);
                            if (f != null) 
                            {
                                app.deleteDokter(j);
                                System.out.println("Data Dokter Berhasil Dihapus");
                            }
                            else {
                                System.out.println("Data Tidak Ditemukan");
                            }
                            break;
                        
                        case 4:
                            break;
                    
                    }
                    }
                    break;
                    
                case 3:
                    pil2 = 0;
                    while(pil2 != 3){
                    System.out.println();
                    System.out.println("-Data Kelas-");
                    System.out.println("1.Insert Kelas");
                    System.out.println("2.Search Kelas");
                    System.out.println("3.Kembali");
                    System.out.print("Pilih :");
                    pil2 = s1.nextInt();
                    switch(pil2){
                        case 1:
                            System.out.println();
                            System.out.println("Nama Kelas : ");
                            String nmkelas = s2.nextLine();
                            app.insertKelas(nmkelas);
                            break; 
                        
                        case 2:
                            System.out.println();
                            System.out.print("Masukkan Index Kelas : ");
                            int nmrkls = s1.nextInt();
                            Kelas kls = app.getKelas(nmrkls);
                            if (kls != null) 
                            {
                                System.out.println("Nama = " + kls.getNamaKelas());
                            }
                            else 
                            {
                                System.out.println("Data Tidak Ditemukan");
                            }
                            break;
                         
                        case 3:
                            break;
                    }
                    }
                    break;
                    
                case 4:
                    pil2 = 0;
                    while(pil2 != 7){
                    System.out.println();
                    System.out.println("-Data Ruangan-");
                    System.out.println("1.Insert Ruangan");
                    System.out.println("2.Search Ruangan");
                    System.out.println("3.Insert Pasien Inap");
                    System.out.println("4.Search Pasien Inap By Index");
                    System.out.println("5.Search Pasien Inap By ID");
                    System.out.println("6.Delete Pasien Inap");
                    System.out.println("7.Insert Diagnosa Untuk Pasien Inap");
                    System.out.println("8.Delete Diagnosa Untuk Pasien Inap");
                    System.out.println("9.Kembali");
                    System.out.print("Pilih :");
                    pil2 = s1.nextInt();
                    switch(pil2){
                        case 1:
                            System.out.println();
                            System.out.println("No Kamar : ");
                            int nokam = s1.nextInt();
                            System.out.println("Masukkan Kelas :");
                            String nmklss = s2.nextLine();
                            for(int h=0;h<app.banyakkelas();h++){
                               if(nmklss == app.getKelas(h).getNamaKelas()){
                                   Kelas kl = app.getKelas(h);
                                   app.insertRuangan(nokam,kl);
                               }
                               else{
                                   System.out.println("Kelas Tidak Ada");
                               }
                            }
                            break; 
                        
                        case 2:
                            System.out.println();
                            System.out.print("Masukkan Index Ruangan : ");
                            int nmrruangan = s1.nextInt();
                            Ruangan rua = app.getRuangan(nmrruangan);
                            if (rua != null) 
                            {
                                System.out.println("Nama = " + rua.getNoKamar());
                                System.out.println("Kelas = "+ rua.getNamaKelas().getNamaKelas());
                            }
                            else 
                            {
                                System.out.println("Data Tidak Ditemukan");
                            }
                            break;
                         
                        case 3:
                            System.out.println();
                            System.out.print("Masukkan Index Ruangan : ");
                            int nmrruangann = s1.nextInt();
                            Ruangan ruangg = app.getRuangan(nmrruangann);
                            if(ruangg != null)
                            {
                                   System.out.println("Masukkan ID Pasien : ");
                                   int cridpas = s1.nextInt();
                                   for(int p=0;p<app.banyakpasien();p++)
                                   {
                                       if(cridpas == app.getPasien(p).getIdPasien())
                                       {
                                           Pasien temppasien = app.getPasien(p);
                                           System.out.println("Masukkan Nama Dokter : ");
                                           String nmdokter = s2.nextLine();
                                           for(int r=0;r<app.banyakdokter();r++)
                                           {
                                               if(nmdokter == app.getDokter(r).getNama())
                                               {
                                                   Dokter tempdokter = app.getDokter(r);
                                                   app.getRuangan(nmrruangann).tambahPasienInap(temppasien, tempdokter);
                                               }
                                               else
                                               {
                                                   System.out.println("Dokter Tidak Ditemukan");
                                               }
                                           }   
                                       }
                                       else
                                       {
                                           System.out.println("Pasien Tidak Ditemukan");
                                       } 
                                   } 
                                }
                                else
                                {
                                    System.out.println("Ruangan Tidak Ditemukan");
                                }
                          
                            break;
                            
                        case 4:
                            System.out.println();
                            System.out.print("Masukkan Index Ruangan : ");
                            int nmrruangannn = s1.nextInt();
                            Ruangan ruanggg = app.getRuangan(nmrruangannn);
                            if (ruanggg != null)
                            {
                                System.out.println("Masukkan Index Pasien Inap : ");
                                int cridpasidx = s1.nextInt();
                                PasienInap pasieninapp = app.getRuangan(nmrruangannn).getPasienInapbyindex(cridpasidx);
                                if (pasieninapp != null)
                                {
                                    System.out.println("Nama Pasien : " + pasieninapp.getPasien().getNama());
                                    System.out.println("ID Pasien : " + pasieninapp.getPasien().getIdPasien());
                                    System.out.println("Umur Pasien : " + pasieninapp.getPasien().getUmur());
                                    System.out.println("Alamat Pasien : " + pasieninapp.getPasien().getAlamat());
                                    System.out.println("Jenis Kelamin : " + pasieninapp.getPasien().getJenisKelamin());
                                    System.out.println("Golongan Darah : " + pasieninapp.getPasien().getGolDarah());
                                    System.out.println("Tanggal Daftar : " + pasieninapp.getPasien().getTglDaftar());
                                }
                                else
                                {
                                    System.out.println("Pasien Inap Tidak Ada");
                                }
                            }
                            break;
                            
                        case 5:
                            System.out.println();
                            System.out.print("Masukkan Index Ruangan : ");
                            int nmrruangannnn = s1.nextInt();
                            Ruangan ruangggg = app.getRuangan(nmrruangannnn);
                            if (ruangggg != null)
                            {
                                System.out.println("Masukkan ID Pasien Inap : ");
                                int cridpasid = s1.nextInt();
                                PasienInap pasieninappp = app.getRuangan(nmrruangannnn).getPasienInapbyid(cridpasid);
                                if(pasieninappp != null)
                                {
                                    System.out.println("Nama Pasien : " + pasieninappp.getPasien().getNama());
                                    System.out.println("ID Pasien : " + pasieninappp.getPasien().getIdPasien());
                                    System.out.println("Umur Pasien : " + pasieninappp.getPasien().getUmur());
                                    System.out.println("Alamat Pasien : " + pasieninappp.getPasien().getAlamat());
                                    System.out.println("Jenis Kelamin : " + pasieninappp.getPasien().getJenisKelamin());
                                    System.out.println("Golongan Darah : " + pasieninappp.getPasien().getGolDarah());
                                    System.out.println("Tanggal Daftar : " + pasieninappp.getPasien().getTglDaftar());
                                }
                                else
                                {
                                    System.out.println("Pasien Inap Tidak Ada");
                                }
                            }
                            break;
                            
                        case 6:
                            System.out.println();
                            System.out.print("Masukkan Index Ruangan : ");
                            int nmrruangan2 = s1.nextInt();
                            Ruangan ruang2 = app.getRuangan(nmrruangan2);
                            if(ruang2 != null)
                            {
                                System.out.println("Masukkan ID Pasien Inap : ");
                                int cridpasidin = s1.nextInt();
                                PasienInap pasieninap2 = app.getRuangan(nmrruangan2).getPasienInapbyid(cridpasidin);
                                if(pasieninap2 != null)
                                {
                                    if(cridpasidin == pasieninap2.getPasien().getIdPasien())
                                    {
                                        boolean cekhapus = app.getRuangan(nmrruangan2).RemovePasienInap(cridpasidin);
                                        if (cekhapus == true)
                                        {
                                            System.out.println("PasienInap Berhasil Di Hapus");
                                        }
                                        else
                                        {
                                            System.out.println("Pasien Inap Gagal Di Hapus");
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println("Pasien Tidak Tersedia");
                                }
                            }
                            else
                            {
                                System.out.println("Ruangan Tidak Tersedia");
                            }
                            break;
                            
                        case 7:
                            System.out.println();
                            System.out.print("Masukkan Index Ruangan : ");
                            int nmrruangan3 = s1.nextInt();
                            Ruangan ruang3 = app.getRuangan(nmrruangan3);
                            if(ruang3 != null)
                            {
                                System.out.println("Masukkan ID Pasien Inap : ");
                                int cridpasidin3 = s1.nextInt();
                                PasienInap pasieninap3 = app.getRuangan(nmrruangan3).getPasienInapbyid(cridpasidin3);
                                if(pasieninap3 != null)
                                {
                                    System.out.println("Masukkan Gejala : ");
                                    String adddiagnosa1 = s2.nextLine();
                                    app.getRuangan(nmrruangan3).getPasienInapbyid(cridpasidin3).addDiagnosa(adddiagnosa1);
                                }
                                else
                                {
                                    System.out.println("Pasien Inap Tidak Ada");
                                }
                            }
                            else
                            {
                                System.out.println("Ruangan Tidak Tersedia");
                            }
                            break;
                        
                        case 8:
                            System.out.println();
                            System.out.print("Masukkan Index Ruangan : ");
                            int nmrruangan4 = s1.nextInt();
                            Ruangan ruang4 = app.getRuangan(nmrruangan4);
                            if(ruang4 != null)
                            {
                                System.out.println("Masukkan ID Pasien Inap : ");
                                int cridpasidin4 = s1.nextInt();
                                PasienInap pasieninap4 = app.getRuangan(nmrruangan4).getPasienInapbyid(cridpasidin4);
                                if(pasieninap4 != null)
                                {
                                    System.out.println("Masukkan Index Gejala Yang Ingin Di Delete : ");
                                    int deletediagnosa1 = s1.nextInt();
                                    app.getRuangan(nmrruangan4).getPasienInapbyid(cridpasidin4).deleteDiagnosa(deletediagnosa1);
                                }
                                else
                                {
                                    System.out.println("Pasien Inap Tidak Ada");
                                }
                            }
                            else
                            {
                                System.out.println("Ruangan Tidak Tersedia");
                            }
                            break;
                        
                        case 9:
                            break;
                    }
                    }
                    break;
            }
        }
    }

}
