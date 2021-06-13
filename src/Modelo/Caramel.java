package Modelo;

public class Caramel extends Decorator {
    public Caramel(AbstractCoffee coffee) {
        super(coffee);
    }

    public Caramel(AbstractCoffee coffee, int cantidad) {
        super(coffee);
        if (cantidad > 1)
            this.cantidad = 2;
        else this.cantidad = 1;

    }

    @Override
    public void doble() {
        cantidad = 2;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public double getPrecio() {
        return (100 * cantidad);
    }

    public String getTipo() {
        if (cantidad == 2)
            return ("Doble de Caramelo");
        else
            return ("Caramelo");
    }
}
