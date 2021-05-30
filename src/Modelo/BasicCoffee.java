package Modelo;

public class BasicCoffee implements ICoffee {
    @Override
    public double getPrecio() {
        return 1000;
    }

    @Override
    public String getTipo() {
        return "Cafe ";
    }
}
