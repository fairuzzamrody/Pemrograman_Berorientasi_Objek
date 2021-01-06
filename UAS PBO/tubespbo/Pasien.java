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
public class Pasien extends Orang {
	private int idPasien;
	private String tglDaftar;
	private String golDarah;
	
	public Pasien(String nama, int umur, String jenisKelamin, String alamat, int idPasien, String tglDaftar, String golDarah)
	{
		super (nama, umur, jenisKelamin, alamat);
		this.idPasien = idPasien;
		this.tglDaftar = tglDaftar;
		this.golDarah = golDarah;
	}
	
	public String getNama()
	{
		return super.getNama();
	}
	
	public int getUmur() 
	{
		return super.getUmur();
	}
	
	public String getJenisKelamin() 
	{
		return super.getJenisKelamin();
	} 
	
	public String getAlamat() 
	{
		return super.getAlamat();
	}
	
	public int getIdPasien()
	{
		return idPasien;
	}
	
	public String getTglDaftar()
	{
		return tglDaftar;
	}
	
	public String getGolDarah()
	{
		return golDarah;
	}
}
