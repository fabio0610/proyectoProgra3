package Modelo;
public class Soy extends Decorator {

    public Soy(AbstractCoffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrecio() {
        return ( 250);
    }

    @Override
    public String getTipo() {
        return ("Soy");
    }
  
}
