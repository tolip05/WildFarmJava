package farm.abstractions;

public abstract class Feline extends Mammal{
    private String breed;

    public Feline(String name, double weight, String livingRegion,String breed) {
        super(name, weight, livingRegion);
        this.breed = breed;
    }


    private String getBreed() {
        return this.breed;
    }

    @Override
    public String toString() {
        return String.format("%s [%s, %s, %.2f, %s, %d]"
        ,this.getClass().getSimpleName()
                ,super.getName()
                ,this.getBreed()
        ,super.getWeight()
        ,super.getLivingRegion()
        ,super.getFoodEaten());
    }
}
