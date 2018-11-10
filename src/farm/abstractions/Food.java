package farm.abstractions;

import farm.interfaces.Ifood;

public abstract class Food implements Ifood {
    private int quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
