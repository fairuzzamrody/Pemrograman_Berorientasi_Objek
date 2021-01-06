package pack;

public class Film {
	private String namaFilm, sinopsis;
	
	public Film(String namaFilm, String sinopsis) {
		super();
		this.namaFilm = namaFilm;
		this.sinopsis = sinopsis;
	}

	public String getNamaFilm() {
		return namaFilm;
	}
	
	public void setNamaFilm(String namaFilm) {
		this.namaFilm = namaFilm;
	}
	
	public String getSinopsis() {
		return sinopsis;
	}
	
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	@Override
	public String toString() {
		String ret = "Nama Film : " + getNamaFilm();
		return ret;
	}
}