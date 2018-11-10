package farm.abstractions;

public abstract class Animal {
    //string Name, double Weight, int FoodEaten;

    private String name;

    private double weight;

    private int foodEaten;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.foodEaten = 0;
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    public int getFoodEaten() {
        return this.foodEaten;
    }

    protected void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void eatFood(Food food);

    public abstract void produceSound();
}
