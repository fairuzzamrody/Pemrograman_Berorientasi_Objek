public class main {

    public static void main(String[] args) {
        //Deklarasi Tim
        Tim Mawar = new Tim("Bunga");

        //Deklarasi Member
        Member orang_1 = new Member("agus", 19);
        Member orang_2 = new Member("dwi", 21);
        Member orang_3 = new Member("budi", 25);

        //Deklarasi Trainee
        Member orang_4 = new Trainee("dewi", 32, 7);
        Member orang_5 = new Trainee("hamzah", 23, 9);
        Member orang_6 = new Trainee("bagus", 22, 8);

        //Menambahkan data ke ArrayList
        Mawar.addMember(orang_1);
        Mawar.addMember(orang_2);
        Mawar.addMember(orang_3);
        Mawar.addMember(orang_4);
        Mawar.addMember(orang_5);
        Mawar.addMember(orang_6);

        //Output
        Mawar.displayFullMember();
        Mawar.displayTrainee();
    }

}