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
public class PasienInap {
	private Pasien pasien;
	private Dokter dokter;
	private String[] diagnosa = new String[5];
	private int jumlahdiagnosa;
	
	public PasienInap (Pasien pasien, Dokter dokter)
	{
		this.pasien = pasien;
		this.dokter = dokter;
	}
	
	public void addDiagnosa(String gejala)
	{
		diagnosa[jumlahdiagnosa] = gejala;
		jumlahdiagnosa++;
	}
	
	public String getDiagnosa(int n)
	{
		return diagnosa[n];
	}
	
	public void deleteDiagnosa(int n)
	{
		diagnosa[n] = null;
		jumlahdiagnosa--;
	}
	
	public void setPasien(Pasien pasien)
	{
		this.pasien = pasien;
	}
	
	public Pasien getPasien()
	{
		return pasien;
	}
	
	public void setDokter(Dokter dokter)
	{
		this.dokter = dokter;
	}
	
	public Dokter getDokter()
	{
		return dokter;
	}
	
	public int getJumlahDiagnosa()
	{
		return jumlahdiagnosa;
	}
}
