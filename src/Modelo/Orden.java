package Modelo;

import java.util.ArrayList;

public class Orden {
    public ArrayList<AbstractCoffee> cafelist;

    public void addCoffee(AbstractCoffee coffee){
        cafelist.add(coffee);
    }

    public void rmCoffee(AbstractCoffee coffee){
        cafelist.remove(coffee);
    }

    public String toString(){
        String mensaje = null;
        for(int i = 0; i < cafelist.size();i++){
           mensaje  = "Orden: \n" + "Cafe: " + cafelist.get(i).getTipo() + "\n" + "Precio: " + cafelist.get(i).getPrecio()+ "\n";
        }
       
        return mensaje;
    }
}
