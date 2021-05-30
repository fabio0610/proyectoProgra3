package Modelo;

public abstract class Decorator {
    private ICoffee coffee;
    public ICoffee getCoffee() {
        return this.coffee;
    }

    public void setCoffee(ICoffee coffee) {
        this.coffee = coffee;
    }

    public Decorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    public abstract String getTipo();

    public abstract double getPrecio();
}


