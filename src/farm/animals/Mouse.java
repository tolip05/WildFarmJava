package farm.animals;

import farm.abstractions.Food;
import farm.abstractions.Mammal;

public class Mouse extends Mammal {
    private final double INCREASE_WEIGHT = 0.10;
    public Mouse(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public void eatFood(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")
        || food.getClass().getSimpleName().equals("Fruit")) {
            super.setFoodEaten(food.getQuantity());
            super.setWeight(super.getWeight() + (food.getQuantity() * INCREASE_WEIGHT));
        } else {
            throw new IllegalArgumentException(String.format("%s does not eat %s"
                    , this.getClass().getSimpleName(), food.getClass().getSimpleName()));
        }


    }

    @Override
    public void produceSound() {
        System.out.println("Squeak");
    }
}
