package Clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooInterface {
    private Zookeeper zookeeper;
    private List<Animal> animalList=new ArrayList<>();

    public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
        this.zookeeper = zookeeper;
        this.animalList = animalList;
    }

    public Zoo() {
        this.zookeeper = new Zookeeper("ION");
    }
    public void AdaugaAnimal(Animal animal){
        animalList.add(animal);
    }
    public void FeedAllAnimals(){
        for (Animal animal:animalList) {
            zookeeper.feed(animal);
        }
    }

}
