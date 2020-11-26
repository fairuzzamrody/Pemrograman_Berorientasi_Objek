public class Trainee extends Member{
    private int lamaTraining;
    
    public Trainee(String nama , int umur , int lamaTraining){
        super(nama,umur);
        this.lamaTraining = lamaTraining;
    }
    public int getLama(){
        return this.lamaTraining;
    }
    @Override
    public void display(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
        System.out.println("Lama Training : " this.lamaTraining);
    }
}