public class Tim{
    private String nama;
    private Member[] m = new Member[10];
    
    public void setMember(Member Fairuz){
        int lop =0
        for (lop = 0 ; lop < 10; ++lop){
            System.out.println(lop);
            if (m[lop] == null){
                m[lop] = Fairuz;
                break;
            }
        }
    }
    
    public void displlayFullMember(){
        for (int lop = 0 ; lop < 10 ; lop++) {
            if ( m[lop] !=null){
                if ("Member".equals(m[lop].getClass().getSimpleName())) {
                    m1.display();
                }
                }
        }
    }
    public void displayTrainee(){
        for (Member m1 : m) {
            if (m1 !=null){
                if ("Trainee".equals(m1.getClass().getSimpleName())){
                    m1.display();
                }
            }
        }
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
}
