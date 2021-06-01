package Modelo;

public class HouseBlend extends AbstractCoffee {
    public HouseBlend() {
        tipo="House Blend with \n";
        precio=1400;
    }

    @Override
    public void addDecorator(Decorator decorator) {
        precio=precio+decorator.getPrecio();
        tipo=tipo+decorator.getTipo();
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
    