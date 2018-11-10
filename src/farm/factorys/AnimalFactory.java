package farm.factorys;

import farm.abstractions.Animal;
import farm.animals.*;

public class AnimalFactory {
    public Animal createAnimal(String[]tokens){

        String type = tokens[0];
        type = type.toLowerCase();
        String name = tokens[1];
        double weight = Double.parseDouble(tokens[2]);

        switch (type){
            case "cat":
                return new Cat(name,weight,tokens[3],tokens[4]);
            case "tiger":
                return new Tiger(name,weight,tokens[3],tokens[4]);
            case "dog":
                return new Dog(name,weight,tokens[3]);
            case "mouse":
                return new Mouse(name,weight,tokens[3]);
            case "owl":
                return new Owl(name,weight,Double.parseDouble(tokens[3]));
            case "hen":
                return new Hen(name,weight,Double.parseDouble(tokens[3]));
                default:
                    return null;
        }
    }
}
