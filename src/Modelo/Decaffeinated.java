package Modelo;

public class Decaffeinated implements ICoffee {
    @Override
    public double getPrecio() {
        return 1100;
    }
    @Override
    public String getTipo() {
        return "Decaffeinated\n";
    }

}
