package lesson1;

public class App {
    public static void main(String[] args) {



        final Zoo<Animal> zoo = new Zoo<>();
        final Lion lion = new Lion("Simba", 3);
        zoo.encage(lion);
        zoo.encage(new Snake("Kaa", 100));
        zoo.encage(new Elephant("Jumbo", 1));
        final Animal animal = zoo.release(lion);

        final Zoo<Snake> serpentarium = new Zoo<>();
        final Snake snake = new Snake("Nagaina", 200);
        serpentarium.encage(snake);
        final Snake release = serpentarium.release(snake);

        final Zoo<Animal> animalZoo = Zoo.create();
    }
}
