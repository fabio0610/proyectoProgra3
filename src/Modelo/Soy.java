package Modelo;
public class Soy extends Decorator {

    public Soy(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrecio() {
        return (getCoffee().getPrecio() + 250);
    }

    @Override
    public String getTipo() {
        return (getCoffee().getTipo()+"+ Soy");
    }
  
}
