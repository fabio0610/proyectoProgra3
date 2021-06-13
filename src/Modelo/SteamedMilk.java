package Modelo;

public class SteamedMilk extends Decorator {


    @Override
    public String getTipo() {
        if (cantidad == 2)
            return ("Doble de Leche al vapor");
        else
            return ("Steamed Milk");
    }

    @Override
    public double getPrecio() {
        return (50 * cantidad);
    }

    public SteamedMilk(AbstractCoffee coffe) {
        super(coffe);
    }

    public SteamedMilk(AbstractCoffee coffe, int cantidad) {
        super(coffe);
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
}
