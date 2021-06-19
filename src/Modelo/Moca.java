package Modelo;

public class Moca extends Decorator {

    public Moca(AbstractCoffee coffee) {
        super(coffee);
    }

    public Moca(AbstractCoffee coffee, int cantidad) {
        super(coffee);
        if (cantidad > 1)
            this.cantidad = 2;
        else this.cantidad = 1;
    }

    public String getTipo() {
        if (cantidad == 2)
            return ("Doble de Moca");
        else
            return ("Moca");
    }

    @Override
    public double getPrecio() {
        return (cantidad * 300);
    }

}
