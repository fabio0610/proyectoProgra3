package Modelo;

import java.util.ArrayList;

public class Orden {
    public int contador=0;
    public Orden() {
cafelist=new ArrayList<>();
    }

    public ArrayList<AbstractCoffee> cafelist;

    public void addCoffee(AbstractCoffee coffee){
        cafelist.add(coffee);
    }
    public void eraseAll(){
        cafelist.clear();
    }

    public void rmCoffee(AbstractCoffee coffee){
        cafelist.remove(coffee);
    }

    public String toString(){
        StringBuilder mensaje = new StringBuilder("Orden "+ contador+":\n");
        for(int i = 0; i < cafelist.size();i++){
           mensaje.append("Cafe: ").append(cafelist.get(i).getTipo().replaceFirst(",", "")).append(".").append("\n").append("Precio: ").append(cafelist.get(i).getPrecio()).append("\n");
        }

        return mensaje.toString();
    }
}
