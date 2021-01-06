package pack;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Studio {
	private Film film = null;
	ArrayList<JamTayang> jamTayang;
	private long hargaTiket = 40000; 
	
	public Studio(Film film, ArrayList<JamTayang> jamTayang) {
		this.film = film;
		this.jamTayang = jamTayang;
	}
	
	public Studio() {
		
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}
	
	public void cancelReservation() {
            /**
             * Fungsi lanjutan untuk pembatalan pemesanan kursi dengan
             * menginputkan secara langsung kursi yang akan dibatalkan pemesanannya,
             * status pemesanan kursi akan diubah menjadi false.
             */
		int n = 1;
		for (JamTayang jam : jamTayang) {
			System.out.println(n + ". " + jam.getJam() +  ", Kursi tersedia : " + jam.getAvailableSeats() + "\n");
			n++;
		}
		System.out.print("Masukkan pilihan jam[1-" + (n - 1) + "] : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.print("Masukkan nomor kursi : ");
		s = new Scanner(System.in);
		String noKursi = s.nextLine();
		
		jamTayang.get(n - 1).cancelReservation(noKursi);
	}
	
	public Transaksi reserveSeat() {
            /**
             * Fungsi lanjutan untuk pemesanan kursi dengan menginputkan secara
             * langsung nomor kursi yang akan dipesan, kursi yang dipesan akan
             * berubah status pemesanannya menjadi true.
             */
		int n = 1;
		int pil = 0;
		int jmlKursi = 0;
		boolean exc = false;
		String daftarKursi = "";
		
		System.out.println("Jam yang tersedia : ");
		for (JamTayang jam : jamTayang) {
			System.out.println(n + ".  " + jam.getJam() + ", Kursi tersedia : " + jam.getAvailableSeats());
			n++;
		}
		System.out.print("Masukkan pilihan jam[1-" + (n - 1) + "] : ");
		Scanner s = new Scanner(System.in);
		try {
			pil = s.nextInt();
			if (pil < 1 || pil > n) {
				System.out.println("Pilihan invalid");
			}
		} catch (InputMismatchException e) {
			System.out.println("Pilihan invalid");
			exc = true;
		}
		
		if (!exc) {
			char repeat = 'y';
			while (repeat != 'n') {
				Kursi[][] k = ((JamTayang) jamTayang.get(pil - 1)).getKursi();
				System.out.println("Kursi tersedia : ");
				for (int x = 0; x < 6; x++) {
					if (x == 0) {
						System.out.print("[A | ");
					} else if (x == 1) {
						System.out.print("[B | ");
					} else if (x == 2) {
						System.out.print("[C | ");
					} else if (x == 3) {
						System.out.print("[D | ");
					} else if (x == 4) {
						System.out.print("[E | ");
					} else if (x == 5) {
						System.out.print("[F | ");
					}
					for (int y = 0; y < 5; y++) {
						if (!k[x][y].isReserved()) {
							System.out.print((y + 1) + " ");
						} else {
							System.out.print("X ");
						}
					}
					System.out.println("]");
				}
				System.out.print("Masukkan nomor kursi : ");
				s = new Scanner(System.in);
				String noKursi = s.nextLine();
				if (noKursi.length() != 2) {
					System.out.println("Invalid nomor kursi");
				} else {
					daftarKursi += jamTayang.get(pil - 1).reserveSeat(noKursi) + "; ";
					jmlKursi++;
				}
				System.out.print("Tambah kursi? [y/n] ");
				repeat = s.next().charAt(0);
			}
		}
		
		return new Transaksi(getFilm().getNamaFilm(), jamTayang.get(pil - 1).getJam(), hargaTiket, daftarKursi, jmlKursi);
	}
	
	public void addJamTayang(String jam) {
            /**
             * Menambahkan jam tayang baru dengan menginstansiasikan objek
             * jam tayang baru ke dalam array list jam tayang yang ada pada
             * masing-masing studio.
             */
		jamTayang.add(new JamTayang(jam));
	}
        
        public ArrayList<JamTayang> getList() {
            return jamTayang;
        }
        
        public void updateJamTayang(ArrayList<JamTayang> jamTayang) {
            /**
             * Mengupdate jam tayang setelah finalisasi pemesanan atau pembatalan
             * pemesanan kursi bioskop.
             */
            this.jamTayang = jamTayang;
        }
	
	@Override
	public String toString() {
		String ret = "";
		if (film == null) {
			ret = ret + "Tidak ada film yang ditayangkan di studio ini";
		} else {
			ret = ret + film.toString() + "\n" + 
                                    film.getSinopsis() + "\n";
		}
		
		return ret;
	}
}