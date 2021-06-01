package Modelo;

import java.util.ArrayList;

public class Orden {
    public Orden() {
cafelist=new ArrayList<>();
    }

    public ArrayList<AbstractCoffee> cafelist;

    public void addCoffee(AbstractCoffee coffee){
        cafelist.add(coffee);
    }

    public void rmCoffee(AbstractCoffee coffee){
        cafelist.remove(coffee);
    }

    public String toString(){
        StringBuilder mensaje = new StringBuilder("");
        for(int i = 0; i < cafelist.size();i++){
           mensaje.append("Orden: \n").append("Cafe: ").append(cafelist.get(i).getTipo()).append("\n").append("Precio: ").append(cafelist.get(i).getPrecio()).append("\n");
        }

        return mensaje.toString();
    }
}
