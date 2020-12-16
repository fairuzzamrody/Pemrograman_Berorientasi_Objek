interface robot{
    public void setnama (String nama);
    public void settahunpembuatan (int tahun);
    public void display ();
}

interface Doraemon {
    static void saydora (){
        System.out.println("Halo, Saya Doramini.");
    }
    static void displaykatongajaib (){
        System.out.println("Saya juga seperti Doraemon yang memiliki kantong ajaib.");
    }
}

class Doramini implements robot, Doraemon{
    String nama;
    String pemilik;
    int tahun;

    public void setpemilik (String pemilik){
        this.pemilik = pemilik;
    }

    public void getpemilik (){
        System.out.println("Pemilik : " + this.pemilik);
    }

    public void setnama (String nama){
        this.nama = nama;
    }

    public void getnama (){
        System.out.println("Nama    : " + this.nama);
    }

    public void settahunpembuatan (int tahun){
        this.tahun = tahun;
    }

    public void gettahun (){
        System.out.println("Tahun   : " + this.tahun);
    }

    public void display (){
        Doraemon.saydora();
        Doraemon.displaykatongajaib();
        getnama();
        getpemilik();
        gettahun();
    }
}

class app {
    public static void main(String[] args) {

        Doramini aDoramini = new Doramini();
        aDoramini.setnama("nama");
        aDoramini.setpemilik("pemilik");
        aDoramini.settahunpembuatan(1234);
        
        aDoramini.display();

    }
}