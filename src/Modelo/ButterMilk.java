package Modelo;

public class ButterMilk extends Decorator {
    public ButterMilk(AbstractCoffee coffee) {
        super(coffee);
    }

    public ButterMilk(AbstractCoffee coffee, int cantidad) {
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
        return (300 * cantidad);
    }

    @Override
    public String getTipo() {
        if (cantidad == 2)
            return ("Doble de Leche batida");
        else
            return ("Leche batida");
    }

}
