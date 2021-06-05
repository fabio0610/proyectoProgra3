package Modelo;

public class Caramel extends Decorator {
    public Caramel(AbstractCoffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrecio() {
        return (100);
    }

    @Override
    public String getTipo() {
        return ("Caramel");
    }
}
