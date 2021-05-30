package Modelo;

public class DarkRoast implements ICoffee {
    @Override
    public double getPrecio() {
        return 1450;
    }
    @Override
    public String getTipo() {
        return "Dark Roast\n ";
    }

}
