package Modelo;

public class DarkRoast extends AbstractCoffee {
    @Override
    public void addDecorator(Decorator decorator) {

    }

    @Override
    public double getPrecio() {
        return 1450;
    }
    @Override
    public String getTipo() {
        return "Dark Roast\n ";
    }

}
