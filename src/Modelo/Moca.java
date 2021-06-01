package Modelo;
public class Moca extends Decorator {

    public Moca(AbstractCoffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getTipo() {
        return (getCoffee().getTipo()+"+ Moca");
    }

    @Override
    public double getPrecio() {
        return (getCoffee().getPrecio() + 300);
    }

}
