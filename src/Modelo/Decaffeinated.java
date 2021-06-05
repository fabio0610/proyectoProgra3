package Modelo;

public class Decaffeinated extends AbstractCoffee {
    public Decaffeinated() {
        tipo = "Decaffeinated\n";
        precio = 1100;
    }

    @Override
    public void addDecorator(Decorator decorator) {
        precio = precio + decorator.getPrecio();
        tipo = tipo + ", " + decorator.getTipo();

    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

}
