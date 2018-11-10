package farm;

import farm.abstractions.Animal;
import farm.abstractions.Food;
import farm.factorys.AnimalFactory;
import farm.factorys.FoodFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Engine {
    private AnimalFactory animalFactory;
    private FoodFactory foodFactory;
    private HashSet<Animal> animals;

    public Engine() {
        this.foodFactory = new FoodFactory();
        this.animalFactory = new AnimalFactory();
        this.animals = new HashSet<>();
    }
    public void run() throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        while (!"end".equalsIgnoreCase(input)){

            String[] animalArgs = input.split("\\s+");
            Animal animal = animalFactory.createAnimal(animalArgs);
            String[] foodArgs = br.readLine().split("\\s+");
            Food food = foodFactory.getFood(foodArgs);
  //          animals.add(animal);
            try{
                animal.produceSound();
                animal.eatFood(food);
                animals.add(animal);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
              animals.add(animal);
            input = br.readLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
