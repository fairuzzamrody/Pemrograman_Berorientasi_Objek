package pack;

import java.util.ArrayList;


public class Bioskop {
	private String nama, alamat;
	Studio[] studio;
        
	
	public Bioskop(String nama, String alamat) {
		this.nama = nama;
		this.alamat = alamat;
		studio = new Studio[5];
		for (int n = 0; n < 5; n++) {
			studio[n] = new Studio();
		}
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getAlamat() {
		return alamat;
	}
	
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public Transaksi reserveSeat(int nStudio) {
            /**
             * Fungsi untuk memesan kursi dalam studio, input no studio dan fungsi dilanjutkan
             * ke fungsi pemesanan kursi di class Studio yang dipilih.
             */
		Transaksi ret = null;
		System.out.println(studio[nStudio-1].toString());
		if (studio[nStudio-1].getFilm() != null) {
			ret = studio[nStudio-1].reserveSeat();
		}
		
		return ret;
	}
	
	public void cancelReservation(int nStudio) {
            /**
             * Fungsi pembatalan pemesanan kursi dalam studio yang dipilih,
             * Dilanjutkan dengan fungsi pembatalan di class Studio yang dipilih.
             */
		studio[nStudio - 1].cancelReservation();
	}
	
	public void setFilmToStudio(int nStudio, String namaFilm, String sinopsis, ArrayList<JamTayang> jamTayang) {
            /**
             * Memasukkan film ke studio yang dipilih serta memasukkan jam tayang 
             * film tersebut dan daftar kursi yang tersedia masing-masing jadwal
             * pemutaran.
             */
            studio[nStudio - 1] = new Studio(new Film(namaFilm, sinopsis), jamTayang);
	}
        
        public Studio getStudio(int noStudio) {
            return studio[noStudio-1];
        }

	@Override
	public String toString() {
		String ret = "";
		for (int n = 0; n < 5; n++) {
			ret = ret + "----Studio " + (n + 1) + "----\n" +
				         studio[n].toString() + "\n";
		}
		
		return ret;
	}
	
}