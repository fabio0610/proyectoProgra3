package Modelo;
public class ButterMilk extends Decorator {

    public ButterMilk(AbstractCoffee coffee) {
        super(coffee);
    }
    @Override
    public double getPrecio() {
        return ( 300);
    }
    @Override
    public String getTipo() {
        return (" Butter Milk");
    }

}
