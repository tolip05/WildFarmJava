package farm.abstractions;

public abstract class Bird extends Animal{
    private double wingSize;

    public Bird(String name, double weight,double wingSize) {
        super(name, weight);
        this.wingSize = wingSize;
    }

    private double getWingSize() {
        return this.wingSize;
    }

    @Override
    public String toString() {
        return String.format("%s [%s, %.2f, %.2f, %d]"
        ,this.getClass().getSimpleName()
                ,super.getName()
                ,this.getWingSize()
                ,super.getWeight()
                ,super.getFoodEaten());
    }
}
