package farm.animals;

import farm.abstractions.Bird;
import farm.abstractions.Food;
import farm.foods.Meat;

public class Owl extends Bird {
    private final double INCREASE_WEIGHT = 0.25;
    public Owl(String name, double weight, double wingSize) {
        super(name, weight, wingSize);
    }

    @Override
    public void eatFood(Food food) {
      if (food.getClass().getSimpleName().equals("Meat")){
          super.setFoodEaten(food.getQuantity());
          super.setWeight(super.getWeight() + (food.getQuantity() * INCREASE_WEIGHT));
      }else{
          throw new IllegalArgumentException(String.format("%s does not eat %s"
                  ,this.getClass().getSimpleName(),food.getClass().getSimpleName()));
      }
    }

    @Override
    public void produceSound() {
        System.out.println("Hoot Hoot");
    }
}
