
class Novel{
    String Judul;
    String NamaPengarang;
    String TahunTerbit;
    String Deskripsi;
    int Harga;
   }
   
   public class Main{
       public static void main (String[] args) throws Exception {
  
           Novel novel1 = new Novel();
           Novel1.Judul ="Tetap sehat";
           Novel1.NamaPengarang ="Dr. salma";
           Novel1.TahunTerbit = "2014";
           Novel1.Deskripsi = "Tetap sehat karena olah raga";
           Novel1.Harga = "135.000";
           
           System.out.print(Novel1.Judul);
           System.out.print(Novel1.NamaPengarang );
           System.out.print(Novel1.TahunTerbit);
           System.out.print(Novel1.Deskripsi);
           System.out.print(Novel1.Harga);
   
           Novel2 novel2 = new Novel();
           Novel2.Judul ="Fairuz Ganteng";
           Novel2.NamaPengarang ="Prof Fairuz";
           Novel2.TahunTerbit ="2001";
           Novel2.Deskripsi = "Fairuz Adalah anak Baik";
           Novel2.Harga ="500.000";
           
           System.out.print(Novel2.Judul);
           System.out.print(Novel2.NamaPengarang );
           System.out.print(Novel2.TahunTerbit);
           System.out.print(Novel2.Deskripsi);
           System.out.print(Novel2.Harga);
           
           Novel novel3 = new Novel();
           Novel3.Judul = "Belajar COding Bersama Fairuz ";
           Novel3.NamaPengarang = "Fairuz zamrody";
           Novel3.TahunTerbit = "2020";
           Novel3.Deskripsi = "Coding lebih mudah bersama fairuz";
           Novel3.Harga = "105.000";
           
           System.out.print(Novel3.Judul);
           System.out.print(Novel3.NamaPengarang );
           System.out.print(Novel3.TahunTerbit);
           System.out.print(Novel3.Deskripsi);
           System.out.print(Novel3.Harga);
       }
   }