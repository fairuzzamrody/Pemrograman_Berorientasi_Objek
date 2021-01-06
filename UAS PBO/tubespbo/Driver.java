/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Fairuz Zamrody (19051397056)
 */
public class Driver {

    public static void main(String[] args) {

        Dokter[] dok = new Dokter[3];
        dok[0] = new Dokter("Adzan", 28, "Pria", "Bekasi", 123456, "THT");
        dok[1] = new Dokter("Kusuma", 27, "Pria", "Bali", 123457, "Bedah");
        dok[2] = new Dokter("Vicha", 26, "Wanita", "Sragen", 123458, "Kandungan");

        Pasien[] pas = new Pasien[6];
        pas[0] = new Pasien("Nugraha", 19, "Pria", "Bandung", 1111, "19 Februari 2016", "AB");
        pas[1] = new Pasien("Hendra", 18, "Pria", "Yogyakarta", 1112, "22 Maret 2016", "A");
        pas[2] = new Pasien("Octavia", 17, "Wanita", "Solo", 1113, "04 April 2016", "O");
        pas[3] = new Pasien("Tama", 22, "Wanita", "Klaten", 1114, "18 April 2016", "B");
        pas[4] = new Pasien("Wijaya", 18, "Pria", "Medan", 1115, "02 Mei 2016", "AB");
        pas[5] = new Pasien("Ichsan", 24, "Pria", "Jakarta", 1116, "25 Juni 2016", "A");

        Kelas[] kel = new Kelas[4];
        kel[0] = new Kelas("Anggrek");
        kel[1] = new Kelas("Bakau");
        kel[2] = new Kelas("Cendana");
        kel[3] = new Kelas("Duri");

        Ruangan[] ru = new Ruangan[12];
        ru[0] = new Ruangan(1, kel[0]);
        ru[1] = new Ruangan(2, kel[0]);
        ru[2] = new Ruangan(3, kel[0]);
        ru[3] = new Ruangan(4, kel[1]);
        ru[4] = new Ruangan(5, kel[1]);
        ru[5] = new Ruangan(6, kel[1]);
        ru[6] = new Ruangan(7, kel[2]);
        ru[7] = new Ruangan(8, kel[2]);
        ru[8] = new Ruangan(9, kel[2]);
        ru[9] = new Ruangan(10, kel[3]);
        ru[10] = new Ruangan(11, kel[3]);
        ru[11] = new Ruangan(12, kel[3]);

        ru[0].tambahPasienInap(pas[0], dok[0]);
        ru[1].tambahPasienInap(pas[1], dok[0]);
        ru[1].tambahPasienInap(pas[2], dok[1]);
        ru[2].tambahPasienInap(pas[3], dok[1]);
        ru[2].tambahPasienInap(pas[4], dok[2]);
        ru[3].tambahPasienInap(pas[5], dok[2]);

        System.out.println("----------------------------------");
        System.out.println("----Test Pembuatan Semua Objek----");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Dokter");
        for (int i = 0; i < dok.length; i++) {
            System.out.println("----------------------------------");
            System.out.println("Nama Dokter		: " + dok[i].getNama());
            System.out.println("Umur Dokter		: " + dok[i].getUmur());
            System.out.println("Jenis Kelamin Dokter	: " + dok[i].getJenisKelamin());
            System.out.println("Alamat			: " + dok[i].getAlamat());
            System.out.println("No SIP			: " + dok[i].getNoSip());
            System.out.println("Spesialis		: " + dok[i].getSpesialis());
        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Pasien");
        for (int i = 0; i < pas.length; i++) {
            System.out.println("----------------------------------");
            System.out.println("Nama Pasien		: " + pas[i].getNama());
            System.out.println("Umur Pasien		: " + pas[i].getUmur());
            System.out.println("Jenis Kelamin Pasien	: " + pas[i].getJenisKelamin());
            System.out.println("Alamat Pasien		: " + pas[i].getAlamat());
            System.out.println("ID Pasien		: " + pas[i].getIdPasien());
            System.out.println("Tanggal Daftar Pasien	: " + pas[i].getTglDaftar());
            System.out.println("Golongan Darah Pasien	: " + pas[i].getGolDarah());
        }

        ru[0].getPasienInapbyindex(0).addDiagnosa("Kanker");
        ru[1].getPasienInapbyindex(0).addDiagnosa("Struk");
        ru[1].getPasienInapbyindex(1).addDiagnosa("Sinus");
        ru[2].getPasienInapbyindex(0).addDiagnosa("Katarak");
        ru[2].getPasienInapbyindex(1).addDiagnosa("Demam");
        ru[3].getPasienInapbyindex(0).addDiagnosa("Vertigo");

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("-------Test Tambah Diagnosa--------");
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Output Menggunakan GetDiagnosa By Index");
        System.out.println("---------------------------------------");
        for (int m = 0; m < ru.length; m++) {
            System.out.println();
            System.out.println("Ruangan " + (m + 1));
            System.out.println("-----------------------------------");
            if (ru[m].getJumlahPasien() != 0) {
                for (int x = 0; x < ru[m].getJumlahPasien(); x++) {
                    System.out.println("Pasien Inap " + (x + 1));
                    System.out.println("-----------------------------------");
                    if (ru[m].getPasienInapbyindex(x).getJumlahDiagnosa() == 0) {
                        System.out.println("Diagnosa Kosong");
                    } else {
                        for (int n = 0; n < ru[m].getPasienInapbyindex(x).getJumlahDiagnosa(); n++) {
                            System.out.println("Diagnosa " + (n + 1) + "	: " + ru[m].getPasienInapbyindex(x).getDiagnosa(n));
                        }
                        System.out.println("Jumlah Diagnosa	: " + ru[m].getPasienInapbyindex(x).getJumlahDiagnosa());
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Tidak Ada Pasien Terdaftar");
            }

        }

        ru[1].getPasienInapbyindex(1).deleteDiagnosa(1);

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("-----Test Delete DIagnosa Pasien Inap------");
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("Output Menggunakan GetPasienInap By ID Pasien");
        System.out.println("---------------------------------------------");

        PasienInap pain2 = ru[0].getPasienInapbyid(1111);
        if (pain2 != null) {
            pain2.deleteDiagnosa(0);
        }

        boolean pain3 = ru[1].RemovePasienInap(1113);
        if (pain3 == true) {
            System.out.println("Berhasil Di Remove");
        }

        for (int a = 0; a < ru.length; a++) {
            System.out.println();
            System.out.println("Ruangan " + (a + 1));
            System.out.println("-----------------------------------");
            if (ru[a].getJumlahPasien() != 0) {

                for (int b = 0; b < ru[a].getJumlahPasien(); b++) {
                    System.out.println("Pasien Inap " + (b + 1));
                    System.out.println("-----------------------------------");
                    if (ru[a].getPasienInapbyindex(b).getJumlahDiagnosa() == 0) {
                        System.out.println("Diagnosa Kosong");
                    } else {
                        for (int c = 0; c < ru[a].getPasienInapbyindex(b).getJumlahDiagnosa(); c++) {
                            System.out.println("Diagnosa " + (c + 1) + "	: " + ru[a].getPasienInapbyindex(b).getDiagnosa(c));
                        }
                        System.out.println("Jumlah Diagnosa	: " + ru[a].getPasienInapbyindex(b).getJumlahDiagnosa());
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Tidak Ada Pasien Terdaftar");
            }

        }
    }

}