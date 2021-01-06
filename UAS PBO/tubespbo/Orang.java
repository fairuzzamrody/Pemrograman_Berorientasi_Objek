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
public abstract class Orang{
	private String nama;
	private int umur;
	private String jenisKelamin;
	private String alamat;
	
	public Orang (String nama, int umur, String jenisKelamin, String alamat)
	{
		this.nama = nama;
		this.umur = umur;
		this.jenisKelamin = jenisKelamin;
		this.alamat = alamat;
	}
	
	public String getNama()
	{
		return nama;
	}
	
	public int getUmur()
	{
		return umur;
	}
	
	public String getJenisKelamin()
	{
		return jenisKelamin;
	}
	
	public String getAlamat()
	{
		return alamat;
	}
}
