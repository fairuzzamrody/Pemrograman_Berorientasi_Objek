abstract class permainan{

    String namaPemain;
    int levelPemain;

    public void setnamaPemain (String namaPemain){
        this.namaPemain = namaPemain;
    }

    public String getnama (){
        return this.namaPemain;
    }

    public void setlevelpemain (int level){
       this.levelPemain = level;
    }

    public int getlevel (){
        return this.levelPemain;
    }

    public void jalankan(){
        System.out.println("Nama Player     : " + getnama());
        if (this.levelPemain <=20){
            System.out.println("Level Player    : Normal" );
        }
        else if(this.levelPemain <=80){
            System.out.println("Level Player    : Medium");
            }
            else if(this.levelPemain<=100){
                System.out.println("level Player    : hard");
                }
                else {
                    System.out.println("Level Maksimum = 100");
                }
    }

    public abstract int hitungskor(int hit, int miss);

}

class permainanArcade extends permainan{

    public int hitungskor(int hit, int miss){
        return hit * 3 - miss * 1;

    }
}

class permainanStrategy extends permainan{

    public int hitungskor(int hit, int miss){
        return hit * 5;

    }
}



class app {
    public static void main(String[] args) {

        System.out.println("Ini Arcade");
        permainan aPermainan = new permainanArcade();
        
        aPermainan.setnamaPemain("namaPemain");
        aPermainan.setlevelpemain(20);

        aPermainan.jalankan();
        System.out.println("Hit Pemain      : " + aPermainan.hitungskor(321, 321)) ;

        System.out.println("");

        System.out.println("Ini Strategy");
        permainan bPermainan = new permainanStrategy();

        bPermainan.setnamaPemain("Tono");
        bPermainan.setlevelpemain(70);

        bPermainan.jalankan();
        System.out.println("Hit Pemain      : " + bPermainan.hitungskor(321, 321)) ;

    }
}