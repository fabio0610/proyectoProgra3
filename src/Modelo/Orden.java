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


    public String print(){
        StringBuilder mensaje = new StringBuilder("----------------------\n"+"Orden "+ contador+":\n");
        for(int i = 0; i < cafelist.size();i++){
           mensaje.append("Cafe ").append(cafelist.get(i).getTipo().replaceFirst(",", "con:")).
                   append("\n").append("Precio: ").append(cafelist.get(i).getPrecio()).append("₡").append("\n");
        }
        return mensaje.toString();
    }
}
