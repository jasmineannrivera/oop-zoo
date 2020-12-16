package OOPZoo;

public class Macaw extends Bird implements Flyable {


    public Macaw(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }


    @Override
    public void fly() {
        System.out.println("Macaw flying high!!");
    }
}
