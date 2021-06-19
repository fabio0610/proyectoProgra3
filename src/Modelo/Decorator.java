package Modelo;

public abstract class Decorator {
    int cantidad = 1;
    private final AbstractCoffee coffee;

    public Decorator(AbstractCoffee coffee) {
        this.coffee = coffee;
    }

    public Decorator(AbstractCoffee coffee, int cantidad) {
        this.coffee = coffee;
        this.cantidad = cantidad;
    }

    public abstract String getTipo();

    public abstract double getPrecio();

}


