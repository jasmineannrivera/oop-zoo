package OOPZoo;

//ZOO IS WHERE MY MAIN METHOD LIVES
public class Zoo {

    public static void main(String[] args) {
//        Animal animal1 = new Animal(12, "Female", 5);
////
////        animal1.eat();
////        animal1.sleep();

        Fish seaBass = new Fish(100, "male", 500);
//        seaBass.eat();
//        seaBass.sleep();
//        seaBass.swim();

//        Bird bird1 = new Bird(73, "Female", 7);
//
//        bird1.eat();
//        bird1.fly();

//        Penguin kingPeng = new Penguin(28, "Female", 20);
        Macaw blueMacaw = new Macaw(56, "Female", 3);
//        blueMacaw.eat();
//        blueMacaw.sleep();
//        blueMacaw.fly();
        blueMacaw.move();
        seaBass.move();
    }
}
