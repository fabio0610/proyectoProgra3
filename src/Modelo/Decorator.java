package Modelo;

public abstract class Decorator {
    int cantidad=1;
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
    public Decorator(AbstractCoffee coffee,int cantidad) {
        this.coffee = coffee; this.cantidad=cantidad;
    }

    public abstract void doble();

    public abstract int getCantidad();

    public abstract String getTipo();

    public abstract double getPrecio();

}


