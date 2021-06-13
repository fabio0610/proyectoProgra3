package Modelo;

public class Soy extends Decorator {

    public Soy(AbstractCoffee coffee) {
        super(coffee);
    }
    public Soy(AbstractCoffee coffee, int cantidad) {
        super(coffee);
        if(cantidad>1)
            this.cantidad=2;
        else this.cantidad=1;
    }

    @Override
    public void doble() {
        cantidad=2;
    }
    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public double getPrecio() {
        return (250*cantidad);
    }

    public String getTipo() {
        if(cantidad==2)
            return ("Doble de Soya");
        else
            return  ("Soya");
    }

}
