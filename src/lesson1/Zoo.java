package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T> {
    private List<T> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void encage(T animal) {
        animals.add(animal);
    }

    public T release(T animal) {
        if (animals.contains(animal)) {
            animals.remove(animal);
            return animal;
        }
        return null;
    }

 //   public <V> void create1(V animal){
 //
 //   }
 //   public static <V>  void create(V animal){
 //
 //   }

    public static <V> Zoo<V> create(){
        return new Zoo<V>();
    }
}

