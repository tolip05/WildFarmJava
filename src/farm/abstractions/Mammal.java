package farm.abstractions;

public abstract class Mammal extends Animal{
    private String livingRegion;
    public Mammal(String name, double weight,String livingRegion) {
        super(name, weight);
        this.livingRegion = livingRegion;
    }

    protected String getLivingRegion() {
        return this.livingRegion;
    }

    @Override
    public String toString() {
        return String.format("%s [%s, %.1f, %s, %d]"
                ,this.getClass().getSimpleName()
                ,super.getName()
                ,super.getWeight()
                ,this.getLivingRegion()
                ,super.getFoodEaten());
    }
}
