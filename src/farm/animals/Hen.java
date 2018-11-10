package farm.animals;

import farm.abstractions.Bird;
import farm.abstractions.Food;

public class Hen extends Bird {
    private final double INCREASE_WEIGHT = 0.35;
    public Hen(String name, double weight, double wingSize) {
        super(name, weight, wingSize);
    }

    @Override
    public void eatFood(Food food) {
      super.setFoodEaten(food.getQuantity());
      super.setWeight(super.getWeight()+ (food.getQuantity() * INCREASE_WEIGHT));
    }

    @Override
    public void produceSound() {
        System.out.println("Cluck");
    }
}
