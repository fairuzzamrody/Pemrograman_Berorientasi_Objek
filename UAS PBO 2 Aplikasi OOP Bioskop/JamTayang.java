package pack;


public class JamTayang {
	private String jam;
	private Kursi[][] kursi;
	
	public JamTayang(String jam) {
            /**
             * Menginstansiasikan 30 kursi setiap sebuah jam tayang terinstansiasi
             * Dengan setiap kursi diberi no kursi dari A1-F5 tergantung dari 
             * posisi kursi dalam array.
             */
		this.jam = jam;
		kursi = new Kursi[6][5];
		for (int n = 0; n < 6; n++) {
			for (int m = 0; m < 5; m++) {
				String s = "";
				if (n == 0) {
					s = s + "A" + (m + 1);
				} else if (n == 1) {
					s = s + "B" + (m + 1);
				} else if (n == 2) {
					s = s + "C" + (m + 1);
				} else if (n == 3) {
					s = s + "D" + (m + 1);
				} else if (n == 4) {
					s = s + "E" + (m + 1);
				} else if (n == 5) {
					s = s + "F" + (m + 1);
				}
				
				kursi[n][m] = new Kursi(s);
			}
		}
	}
	
	public Kursi[][] getKursi() {
		return kursi;
	}
	
	public String getJam() {
		return jam;
	}
	
	public String reserveSeat(String noKursi) {
            /**
             * Pengecekan apakah inputan no kursi dari user sudah valid, apakah
             * kursi ada yang memiliki no kursi tersebut, dan apakah kursi tersebut
             * masih tersedia, bila lolos semua pengecekan maka kursi tersebut
             * akan diset menjadi terpesan.
             */
		String s = "";
		boolean found = false;
		try {
			if (noKursi.length() != 2) throw new IllegalArgumentException("Invalid input");
			for (int n = 0; n < 6; n++) {
				for (int m = 0; m < 5; m++) {
					if (noKursi.equals(kursi[n][m].getNoKursi())) {
						if (kursi[n][m].isReserved()) {
							throw new IllegalArgumentException("Kursi sudah terisi");
						} else {
							found = true;
							s = kursi[n][m].getNoKursi();
							kursi[n][m].setReserved(true);
						}
						break;
					}
				}
			}
			
			if (!found) {
				throw new IllegalArgumentException("Nomor kursi tidak ditemukan");
			}
		} catch(IllegalArgumentException e) {
			throw new IllegalArgumentException(e.getMessage());
		} 
		return s;
	}
	
	public void cancelReservation(String noKursi) {
            /**
             * Pengecekan apakah inputan no kursi dari user sudah valid, apakah
             * kursi ada yang memiliki no kursi tersebut, dan apakah kursi tersebut
             * tidak tersedia, bila lolos semua pengecekan maka kursi tersebut
             * akan diset menjadi tersedia.
             */
		try {
			if (noKursi.length() != 2) throw new IllegalArgumentException("Invalid input");
			for (int n = 0; n < 6; n++) {
				for (int m = 0; m < 5; m++) {
					if (noKursi.equals(kursi[n][m].getNoKursi())) {
						if (kursi[n][m].isReserved() == false) {
							throw new IllegalArgumentException("Kursi belum terisi");
						} else {
							kursi[n][m].setReserved(false);
						}
						break;
					}
				}
			}
		} catch(IllegalArgumentException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}
	
	public int getAvailableSeats() {
            /**
             * Mengembalikan jumlah kursi yang memiliki status tersedia dalam
             * studio yang dipilih dan jam tayang yang dipilih.
             */
		int ret = 0;
		for (int n = 0; n < 6; n++) {
			for (int m = 0; m < 5; m++) {
				if (kursi[n][m].isReserved() == false) {
					ret++;
				}
			}
		}
		
		return ret;
	}
	
        public void setKursi(Kursi[][] kursi) {
            this.kursi = kursi;
        }
        
	public String toString() {
		return "";
	}
}