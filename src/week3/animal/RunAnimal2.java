package week3.animal;

public class RunAnimal2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal duck = new Duck();
        Animal[] animals = {dog, cat, duck};

        for (Animal animal : animals) {
            animalSound(animal);
            animalMove(animal);
        }
    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }

    public static void animalMove(Animal animal) {
        animal.move();
    }

}
