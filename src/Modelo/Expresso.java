package Modelo;

public class Expresso extends AbstractCoffee {
    public Expresso() {
        precio = 1200;
        tipo = "Expresso\n";
    }

    @Override
    public void addDecorator(Decorator decorator) {
        precio = precio + decorator.getPrecio();
        tipo = tipo + ", " + decorator.getTipo();
    }
    @Override
    public void changeTheComa() {
        tipo=tipo.replaceFirst(",","");
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
