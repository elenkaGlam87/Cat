package myfirstobject.animal;

public class Run {
    public static void main(String[] args) {
        Horse horse = new Horse("сено", "ранчо", 200);
        Dog dog = new Dog("кость", "парк", 25);
        Cat cat = new Cat("рыба", "квартира", ",белый");
        Veterinarian veterinarian = new Veterinarian();
        Lion lion = new Lion("зебра", "саванна");
        Elephant elephant = new Elephant("листья", "саванна");
        Wolf wolf = new Wolf("кролик", "лес");

        Animal[] animals = {horse, dog, cat};
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
        System.out.println();
        Animal [] animals1 = {horse, dog, cat, lion, elephant, wolf};
        for (Animal animal: animals1) {
            veterinarian.treatAnimal(animal);
            animal.liveIn(animal);



        }

    }
}
