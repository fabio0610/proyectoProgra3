package Modelo;
public class ButterMilk extends Decorator {

    public ButterMilk(AbstractCoffee coffee) {
        super(coffee);
    }
    @Override
    public double getPrecio() {
        return (getCoffee().getPrecio() + 300);
    }
    @Override
    public String getTipo() {
        return (getCoffee().getTipo()+"+ Leche Batida");
    }

}
