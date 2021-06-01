package Modelo;
public class Moca extends Decorator {

    public Moca(AbstractCoffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getTipo() {
        return ("Moca");
    }

    @Override
    public double getPrecio() {
        return ( 300);
    }

}
