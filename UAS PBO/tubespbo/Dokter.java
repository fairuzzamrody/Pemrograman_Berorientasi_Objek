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
public class Dokter extends Orang {
	private int noSip;
	private String spesialis;
	
	public Dokter (String nama, int umur, String jenisKelamin, String alamat, int noSip, String spesialis) {
		super (nama, umur, jenisKelamin, alamat);
		this.noSip=noSip;
		this.spesialis=spesialis;
	} 
	
	public String getNama(){
		return super.getNama();
	}
	
	public int getUmur() {
		return super.getUmur();
	}
	
	public String getJenisKelamin() {
		return super.getJenisKelamin();
	} 
	
	public String getAlamat() {
		return super.getAlamat();
	}
	
	public int getNoSip() {
		return noSip;
	}
	
	public String getSpesialis() {
		return spesialis;
	}


}