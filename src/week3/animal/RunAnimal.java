package week3.animal;

public class RunAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal duck = new Duck();

        animalSound(dog);
        animalSound(cat);
        animalSound(duck);

        animalMove(dog);
        animalMove(cat);
        animalMove(duck);
    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }

    public static void animalMove(Animal animal) {
        animal.move();
    }

}
