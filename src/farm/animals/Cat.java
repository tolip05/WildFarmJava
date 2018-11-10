package farm.animals;

import farm.abstractions.Feline;
import farm.abstractions.Food;

public class Cat extends Feline {
    private final double INCREASE_WEIGHT = 0.30;

    public Cat(String name, double weight, String livingRegion, String breed) {
        super(name, weight, livingRegion, breed);
    }


    @Override
    public void eatFood(Food food) {
        if (food.getClass().getSimpleName().equals("Meat") ||
        food.getClass().getSimpleName().equals("Vegetable")){
            super.setFoodEaten(food.getQuantity());
            super.setWeight(super.getWeight() + (food.getQuantity() * INCREASE_WEIGHT));
        }else{
            throw new IllegalArgumentException(String.format("%s does not eat %s"
                    ,this.getClass().getSimpleName(),food.getClass().getSimpleName()));
        }
    }

    @Override
    public void produceSound() {
        System.out.println("Meow");
    }
}
