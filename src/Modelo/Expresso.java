package Modelo;

public class Expresso implements ICoffee {
    @Override
    public double getPrecio() {
        return 1200;
    }
    @Override
    public String getTipo() {
        return "Expresso\n";
    }

}
