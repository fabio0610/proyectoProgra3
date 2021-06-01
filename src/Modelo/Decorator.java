package Modelo;

public abstract class Decorator {
    private AbstractCoffee coffee;
    public AbstractCoffee getCoffee() {
        return this.coffee;
    }

    public void setCoffee(AbstractCoffee coffee) {
        this.coffee = coffee;
    }

    public Decorator(AbstractCoffee coffee) {
        this.coffee = coffee;
    }

    public abstract String getTipo();

    public abstract double getPrecio();

}


