package Modelo;

import java.util.ArrayList;

public class Orden {
   private double total=0;
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
        contador=0;
        total=0;
    }
    public double total(){
        total=0;
        for (AbstractCoffee abstractCoffee : cafelist) {
            total += abstractCoffee.getPrecio();
        }
        return total;
    }
    public double getTotal(){
        return total;
    }


    public String print(){
        StringBuilder mensaje = new StringBuilder("----------------------\n"+"Orden "+ contador+":\n");
        for(int i = 0; i < cafelist.size();i++){
           mensaje.append("Cafe ").append(cafelist.get(i).getTipo().replaceFirst(",", "con:")).
                   append("\n").append("Precio: ").append("₡").append(cafelist.get(i).getPrecio()).append("\n");
        }
        return mensaje.toString();
    }
}
