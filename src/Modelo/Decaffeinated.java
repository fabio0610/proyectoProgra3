package Modelo;

public class Decaffeinated extends AbstractCoffee {
    @Override
    public void addDecorator(Decorator decorator) {

    }

    @Override
    public double getPrecio() {
        return 1100;
    }
    @Override
    public String getTipo() {
        return "Decaffeinated\n";
    }

}
