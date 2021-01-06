/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;

/**
 *
 * @author Fairuz Zamrody (19051397056)
 */
public class Application {

    private ArrayList<Dokter> listDokter = new ArrayList();
    private ArrayList<Pasien> listPasien = new ArrayList();
    private ArrayList<Kelas> listKelas = new ArrayList();
    private ArrayList<Ruangan> listRuangan = new ArrayList();

    public void insertDokter(String nama, int umur, String jenisKelamin, String alamat, int noSip, String spesialis) {
        listDokter.add(new Dokter(nama, umur, jenisKelamin, alamat, noSip, spesialis));
    }

    public void insertPasien(String nama, int umur, String jenisKelamin, String alamat, int idPasien, String tglDaftar, String golDarah) {
        listPasien.add(new Pasien(nama, umur, jenisKelamin, alamat, idPasien, tglDaftar, golDarah));
    }

    public void insertKelas(String nmkls) {
        listKelas.add(new Kelas(nmkls));
    }
    
    public void insertRuangan(int nokam, Kelas nmkel) {
        listRuangan.add(new Ruangan(nokam, nmkel));
    }

    public Dokter getDokter(int i) {
        return listDokter.get(i);
    }
    
    public void deleteDokter(int j){
        listDokter.remove(j);
    }
    
    public Pasien getPasien(int k) {
        return listPasien.get(k);
    }
    
    public void deletePasien(int l){
        listPasien.remove(l);
    }
    
    public Kelas getKelas(int m){
        return listKelas.get(m);
    }
    
    public int banyakdokter(){
        return listDokter.size();
    }
    
    public int banyakpasien(){
        return listPasien.size();
    }
    
    public int banyakkelas(){
        return listKelas.size();
    }
    
    public int banyakruangan(){
        return listRuangan.size();
    }
    
    public Ruangan getRuangan(int n){
        return listRuangan.get(n);
    }
}
