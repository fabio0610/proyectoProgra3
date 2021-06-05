package Modelo;

public class SteamedMilk extends Decorator {


    @Override
    public String getTipo() {
        return ("Steamed Milk");
    }

    @Override
    public double getPrecio() {
        return (50);
    }

    public SteamedMilk(AbstractCoffee coffe) {
        super(coffe);
    }
}
