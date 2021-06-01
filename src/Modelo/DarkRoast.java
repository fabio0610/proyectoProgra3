package Modelo;

public class DarkRoast extends AbstractCoffee {
    public DarkRoast() {
        precio=1450;
        tipo="Dark Roast with\n ";
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
