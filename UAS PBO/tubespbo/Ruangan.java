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
public class Ruangan{
	private PasienInap[] daftarPasien = new PasienInap[4];
	private Kelas namakelas;
	private int noKamar;
	private int jumlahpasien;
	
	public Ruangan(int nokam, Kelas nmkel) 
	{
		this.noKamar = nokam;
		this.namakelas = nmkel;
	}
        
        public int getNoKamar()
        {
               return noKamar;
        }
        
        public Kelas getNamaKelas()
        {
                return namakelas; 
        }
	
	public void tambahPasienInap(Pasien pasien, Dokter dokter)
	{
		daftarPasien[jumlahpasien] = new PasienInap(pasien,dokter);
		daftarPasien[jumlahpasien].setPasien(pasien);
		daftarPasien[jumlahpasien].setDokter(dokter);
		jumlahpasien++;
	}
	
	public PasienInap getPasienInapbyindex(int n)
	{
		return daftarPasien[n];
	}
	
	public PasienInap getPasienInapbyid(int id)
	{
		PasienInap daftarPasienn = null;
		if (daftarPasien[0].getPasien() != null)
		{
			for (int i=0;i<jumlahpasien;i++)
			{
				if (daftarPasien[i].getPasien().getIdPasien() == id)
				{
					daftarPasienn = daftarPasien[i];
				}
				
				else
				{
					daftarPasienn = null;
				}
			}
		}
		
		else
		{
			daftarPasienn = null;
		}
		
		return daftarPasienn;
	}
	
	public int getPasienInapbyidandindeks(int id)
	{
		int indeks = -1;
		if (daftarPasien[0].getPasien() != null)
		{
			for (int i=0;i<jumlahpasien;i++)
			{
				if (daftarPasien[i].getPasien().getIdPasien() == id)
				{
					indeks = i;
				}
			}
		}
		return indeks;
	}
	
	public boolean RemovePasienInap(int id)
	{
		int index = getPasienInapbyidandindeks(id);
		if (index != -1)
		{
			daftarPasien[index] = null;
			jumlahpasien--;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getJumlahPasien()
	{
		return jumlahpasien;
	}
}