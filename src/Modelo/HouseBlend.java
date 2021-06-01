package Modelo;

public class HouseBlend extends AbstractCoffee {
    @Override
    public void addDecorator(Decorator decorator) {

    }

    @Override
    public double getPrecio() {
        return 1400;
    }
    @Override
    public String getTipo() {
        return "House Blend\n";
    }

}
    