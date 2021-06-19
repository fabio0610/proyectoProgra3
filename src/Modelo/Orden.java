package Modelo;

import java.util.ArrayList;

public class Orden {
    private double total = 0;
    public int contador = 0;

    public Orden() {
        cafelist = new ArrayList<>();
    }

    public ArrayList<AbstractCoffee> cafelist;

    public void addCoffee(AbstractCoffee coffee) {
        cafelist.add(coffee);
    }

    public void eraseAll() {
        cafelist.clear();
        total = 0;
    }


    public double total() {
        total = 0;
        for (AbstractCoffee abstractCoffee : cafelist) {
            total += abstractCoffee.getPrecio();
        }
        return total;
    }

    public double getTotal() {
        return total;
    }


    public String print() {
        StringBuilder mensaje = new StringBuilder("");
        for (AbstractCoffee abstractCoffee : cafelist) {
            mensaje.append("Cafe ").append(abstractCoffee.getTipo()).append("\n");
        }
        return mensaje.toString();
    }
    public String send() {
        StringBuilder mensaje = new StringBuilder("-----------------\n"+ "Orden "+contador+": \n");
        for (AbstractCoffee abstractCoffee : cafelist) {
            mensaje.append("Cafe ").append(abstractCoffee.getTipo()).
                    append("\n").append("Precio: ").append("₡").append(abstractCoffee.getPrecio()).append("\n");
        }
        return mensaje.toString();
    }
}
