package Modelo;

public class SteamedMilk extends Decorator {

    
    @Override
    public String getTipo() {
        return (getCoffee().getTipo()+"+ Steamed Milk");
    }

    @Override
    public double getPrecio() {
        return (getCoffee().getPrecio() + 50);
    }

    public SteamedMilk(AbstractCoffee coffe) {
        super(coffe);
    }
}
