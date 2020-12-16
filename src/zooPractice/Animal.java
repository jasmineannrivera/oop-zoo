package zooPractice;

public abstract class Animal {


    //Properties: what do all animals have in common?

    protected int age;

    protected String gender;

    protected int weightInLbs;

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }


    //methods: what do all animals do?

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public abstract void move();


}
