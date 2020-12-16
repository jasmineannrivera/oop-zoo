package OOPZoo;

//ABSTRACT CLASS
public abstract class Animal {

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }


    //properties
    protected int age;

    protected String gender;

    protected int weightInLbs;

    //methods
    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public abstract void move();
}
