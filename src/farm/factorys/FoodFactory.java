package farm.factorys;

import farm.abstractions.Food;
import farm.foods.Fruit;
import farm.foods.Meat;
import farm.foods.Seeds;
import farm.foods.Vegetable;

public class FoodFactory {

    public Food getFood(String[] tokens){
        String type = tokens[0];
        type = type.toLowerCase();
        int quantity = Integer.parseInt(tokens[1]);
        switch (type){
            case "vegetable":
                return new Vegetable(quantity);
            case "meat":
                return new Meat(quantity);
            case "fruit":
                return new Fruit(quantity);
            case "seeds":
                return new Seeds(quantity);
                default:
                    return null;

        }
    }
}
