public class Trainee{
    private int lamaTraining;
    protected String name;
    protected int age;

public Trainee (String name, int age, int lamaTraining){
    this.name=name;
    this.age=age;
    this.lamaTraining=lamaTraining;
}
public void getLamaTraining(int lamaTraining){
    this.lamaTraining=lamaTraining;
}
public void display(){
    System.out.println("Nama :"+this.name);
    System.out.println("Umur :"+this.age);
    System.out.println("Lama Training :"+this.lamaTraining);
    
}
}
