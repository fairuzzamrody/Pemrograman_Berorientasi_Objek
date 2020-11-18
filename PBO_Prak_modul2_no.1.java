public class Player {

    private String name;
    private int lifePoint;
    private int attackPower;
    private int defense;

    public Player(String name, int defense) {
        this.name = name;
        this.defense = defense;
        lifePoint = 100;
    }

    public Player(String name, int attackPower, int defense) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        lifePoint = 100;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void getDamage(Player enemy) {
        lifePoint = lifePoint - Math.abs((defense - enemy.getAttackPower()));
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void status(){
        System.out.printf("%s status\n", name);
        System.out.printf("lifePoint \t= %d\n", lifePoint);
        System.out.printf("Attack  = %d\n\n", attackPower);
    }

    public static void main(String[] args) {
        System.out.println("NAMA    : FAIRUZ ZAMRODY");
        System.out.println("NIM     : 19051397056 ");
        System.out.println("PRODI   : D4 MANAJEMEN INFORMATIKA \n");


        System.out.println("    ======================<||> RAIDEN VS SUB ZERO <||>==========================\n\n");
        System.out.println("Raiden menyerang Sub Zero dengan 1x tendangan");

        int defense = 0;
        int attack = 0;
        
        Player player1 = new Player("Raiden", attack, defense);
        Player player2 = new Player("Sub-Zero", attack, defense);

        player1.setAttackPower(20);
        player2.setAttackPower(0);

        
        player2.getDamage(player1);

        player1.status();
        player2.status();
        System.out.println("LIFE POINT SUB ZERO -20\n");
        System.out.println("=====================================================================");
        
        System.out.println("Sub Zero menyerang balik Raiden dengan 1x tendangan");
        
        player2.setAttackPower(25);
        player1.setAttackPower(0);

        
        player1.getDamage(player2);
        
        player1.status();
        player2.status();
        System.out.println("LIFE POINT RAIDEN  -25\n");
        System.out.println("=====================================================================");
        
        System.out.println("Sub Zero menyerang Raiden dengan 3x Pukulan");
        
        player2.setAttackPower(15);
        player1.setAttackPower(0);

        
        player1.getDamage(player2);
        
        player1.status();
        player2.status();
        System.out.println("LIFE POINT RAIDEN  -30\n");
        System.out.println("=====================================================================");
        
        System.out.println("Raiden menyerang Sub Zero dengan 4x Pukulan");
        
        player1.setAttackPower(80);
        player2.setAttackPower(0);

        
        player2.getDamage(player1);
        
        player1.status();
        player2.status();
        
        System.out.println("LIFE POINT SUB ZERO  -80\n");
        
        System.out.println("    ----------------------------------------------------");
        System.out.println("    || PERTANDINGAN RAIDEN VS SUB ZERO TELAH BERAKHIR ||");
        System.out.println("    ----------------------------------------------------\n");

        System.out.println("                LIFEPOINT RAIDEN    = 60");
        System.out.println("                LIFEPOINT SUB-ZERO  = 0\n");
        
        System.out.println("    ================<| RAIDEN WINS |>==================");


    }
}