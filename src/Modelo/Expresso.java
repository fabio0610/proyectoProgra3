package Modelo;

public class Expresso extends AbstractCoffee {
    @Override
    public void addDecorator(Decorator decorator) {

    }

    @Override
    public double getPrecio() {
        return 1200;
    }
    @Override
    public String getTipo() {
        return "Expresso\n";
    }

}
