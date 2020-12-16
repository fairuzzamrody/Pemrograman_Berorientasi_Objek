public class DoraMiniAbs extends Robot {
  public void sayDora() {
    System.out.println("Halo, Saya Dora Mini");
  }
  public void setNama(String nama) {
    super.nama = nama;
  }
  public void displayData() {
    System.out.println("Nama: " + super.nama);
    System.out.println("Pemilik: " + super.pemilik);
    System.out.println("Tahun Produksi: " + super.tahun);
  }
}